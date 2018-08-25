package application.dto;

import java.time.LocalDateTime;
import application.model.Driving.Status;

public class DrivingDTO {
	
	private Long id;
	private Long driverId;
	private String driverName;
	private String timeOfOrdering;
	private String address;
	private Long customerId;
	private String customerName;
	private Long dispatcherId;
	private String dispatcherName;
	private Double amount;
	private String comment;
	private Status status = Status.KREIRANA;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDriverId() {
		return driverId;
	}
	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getDispatcherId() {
		return dispatcherId;
	}
	public void setDispatcherId(Long dispatcherId) {
		this.dispatcherId = dispatcherId;
	}
	public String getDispatcherName() {
		return dispatcherName;
	}
	public void setDispatcherName(String dispatcherName) {
		this.dispatcherName = dispatcherName;
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
	public String getTimeOfOrdering() {
		return timeOfOrdering;
	}
	public void setTimeOfOrdering(String timeOfOrdering) {
		this.timeOfOrdering = timeOfOrdering;
	}
	
	
	
	
}
