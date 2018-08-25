package application.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table
public class Driving {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@ManyToOne (fetch=FetchType.EAGER)
	private Driver driver;
	@Column
	private LocalDateTime timeOfOrdering= LocalDateTime.now();
	@Column
	private String address;
	@ManyToOne (fetch=FetchType.EAGER)
	private Customer customer;
	@ManyToOne (fetch=FetchType.EAGER)
	private Dispatcher dispatcher;
	@Column
	private Double amount;
	@Column
	private String comment;
	@Enumerated(EnumType.ORDINAL)
	@Column
	private Status status = Status.KREIRANA;
	
	public enum Status{
		KREIRANA,
		FOMIRANA,
		OBRADJENA,
		PRIHVACENA,
		UKINUTA,
		USPESNA,
		NEUSPESNA
	}
	
	

	public Driving( Driver driver, LocalDateTime timeOfOrdering, String address, Customer customer,
			Dispatcher dispatcher, double amount, String comment, Status status) {
		super();
		this.driver = driver;
		this.timeOfOrdering = timeOfOrdering;
		this.address = address;
		this.customer = customer;
		this.dispatcher = dispatcher;
		this.amount = amount;
		this.comment = comment;
		this.status = status;
	}
	
	public Driving(){
		
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

	public LocalDateTime getTimeOfOrdering() {
		return timeOfOrdering;
	}

	public void setTimeOfOrdering(LocalDateTime timeOfOrdering) {
		this.timeOfOrdering = timeOfOrdering;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Dispatcher getDispather() {
		return dispatcher;
	}

	public void setDispather(Dispatcher dispather) {
		this.dispatcher = dispather;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
}
