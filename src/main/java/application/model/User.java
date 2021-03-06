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
import javax.persistence.OneToMany;
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
	@Column(unique = true)
	private String username;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String gender;
	@Column(unique = true)
	private String personalIdNum;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String role;
	@OneToMany(mappedBy = "driver")
	private List<Driving> drivingsDriver= new ArrayList<>();
	@OneToMany(mappedBy = "customer")
	private List<Driving> drivingsCustomer= new ArrayList<>();
	@OneToMany(mappedBy = "dispatcher")
	private List<Driving> drivingsDispatcher= new ArrayList<>();
	@Column
	private String password;
	
	
	
	public User() {
	super();
}



	public User(String username, String name, String surname, String gender, String jmbg, String phone, String email,
		String role, String password) {
	super();
	this.username = username;
	this.name = name;
	this.surname = surname;
	this.gender = gender;
	this.personalIdNum = jmbg;
	this.phone = phone;
	this.email = email;
	this.role = role;
	this.password = password;
	
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
	public String getPersonalIdNum() {
		return personalIdNum;
	}
	public void setPersonalIdNum(String jmbg) {
		this.personalIdNum = jmbg;
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
	public List<Driving> getDrivings() {
		return drivingsDriver;
	}
	public void setDrivings(List<Driving> drivings) {
		this.drivingsDriver = drivings;
	}



	public List<Driving> getDrivingsDriver() {
		return drivingsDriver;
	}



	public void setDrivingsDriver(List<Driving> drivingsDriver) {
		this.drivingsDriver = drivingsDriver;
	}



	public List<Driving> getDrivingsCustomer() {
		return drivingsCustomer;
	}



	public void setDrivingsCustomer(List<Driving> drivingsCustomer) {
		this.drivingsCustomer = drivingsCustomer;
	}



	public List<Driving> getDrivingsDispatcher() {
		return drivingsDispatcher;
	}



	public void setDrivingsDispatcher(List<Driving> drivingsDispatcher) {
		this.drivingsDispatcher = drivingsDispatcher;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
