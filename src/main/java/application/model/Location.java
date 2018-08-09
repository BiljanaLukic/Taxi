package application.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Location {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	@OneToMany(fetch=FetchType.LAZY)
	List<Driver> drivers = new ArrayList<>();
}
