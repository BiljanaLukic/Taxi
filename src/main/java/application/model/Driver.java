package application.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
@DiscriminatorValue("DRIVER")
public class Driver extends User{
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Location location;
	@OneToOne
	@JoinColumn(name= "car_id")
	private Car car;
	
	
	public Driver(String username, String name, String surname, String gender, String jmbg, String phone, String email,
			String role, Location location, Car car) {
		super(username, name, surname, gender,  jmbg,  phone,  email, role);
		this.location = location;
		this.car = car;
	}

	
	public Driver() {
	super();
    }
	
	
	public Driver(Location location, Car car) {
		super();
		this.location = location;
		this.car = car;
	}
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	

}
