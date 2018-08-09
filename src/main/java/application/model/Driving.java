package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table
public class Driving {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	@ManyToOne (fetch=FetchType.EAGER)
	private Driver driver;
	

}
