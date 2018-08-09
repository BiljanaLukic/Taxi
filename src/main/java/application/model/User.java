package application.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
public class User {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String username;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String gender;
	@Column
	private String jmbg;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String role;
//	private List<Driving> drivings= new ArrayList<>();
	
	
	
	
	public User() {
	super();
}



	public User(String username, String name, String surname, String gender, String jmbg, String phone, String email,
		String role) {
	super();
	this.username = username;
	this.name = name;
	this.surname = surname;
	this.gender = gender;
	this.jmbg = jmbg;
	this.phone = phone;
	this.email = email;
	this.role = role;
	
}
	

	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
//	public List<Driving> getDrivings() {
//		return drivings;
//	}
//	public void setDrivings(List<Driving> drivings) {
//		this.drivings = drivings;
//	}
	
	
}
