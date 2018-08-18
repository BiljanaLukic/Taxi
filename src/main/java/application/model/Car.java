package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@OneToOne (mappedBy = "car")
	@JoinColumn(name = "driver_id")  //nema svrhu
	private Driver driver;
	@Column
	private Integer age;
	@Column
	private String registrationNumber;
	@Column(unique=true)
	private Integer taxiNumber;
	@Column
	private CarType carType;
	
	public enum CarType{
		KOMBI,
		PUTNICKO_VOZILO
	}
	
	
	
	public Car() {
		super();
	}
	public Car(Integer age, String registrationNumber, Integer taxiNumber, CarType carType) {
		super();
		this.age = age;
		this.registrationNumber = registrationNumber;
		this.taxiNumber = taxiNumber;
		this.carType = carType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", driver=" + driver.getId() + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Integer getTaxiNumber() {
		return taxiNumber;
	}
	public void setTaxiNumber(Integer taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	
}
