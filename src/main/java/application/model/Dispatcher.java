package application.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("DISPATCHER")
public class Dispatcher extends User{
	
	public Dispatcher(){
		
	}
	
	public Dispatcher(String username, String name, String surname, String gender, String jmbg, String phone, String email,
			String role) {
		super(username, name, surname, gender,  jmbg,  phone,  email, role);
		
	}
}
