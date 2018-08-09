package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@OneToOne(mappedBy = "car")
	private Driver driver;
}
