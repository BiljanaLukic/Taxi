package application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Driving {
	
	@Id
	@GeneratedValue
	@Column
	private Integer id;
	

}
