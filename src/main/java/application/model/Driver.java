package application.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
@DiscriminatorValue("DRIVER")
public class Driver extends User{
	
	@OneToOne
	@JoinColumn(name = "car_id")
	private Car car;
	
	
	
	public Driver(String username, String name, String surname, String gender, String jmbg, String phone, String email,
			String role, Car car, String password) {
		super(username, name, surname, gender,  jmbg,  phone,  email, role, password);
		
		this.car = car;
		if (car.getDriver()==null){
			car.setDriver(this);
		}
	}

	
	public Driver() {
	super();
    }
	
	

	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
		if (car.getDriver()==null){
			car.setDriver(this);
		}
	}
	
	

}
