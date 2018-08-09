package application.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("CUSTOMER")
public class Customer extends User{
	
	public Customer(){
		
	}
	
	public Customer(String username, String name, String surname, String gender, String jmbg, String phone, String email,
			String role) {
		super(username, name, surname, gender,  jmbg,  phone,  email, role);
		
	}
}
