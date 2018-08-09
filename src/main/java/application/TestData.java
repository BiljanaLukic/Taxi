package application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import application.model.Car;
import application.model.Customer;
import application.model.Dispatcher;
import application.model.Driver;
import application.model.Location;
import application.repository.CarRepository;
import application.repository.CustomerRepository;
import application.repository.DispatcherRepository;
import application.repository.DriverRepository;
import application.repository.LocationRepository;

@Component
public class TestData {
	@Autowired
	private DispatcherRepository dispatcherRepository;
	@Autowired
	private DriverRepository driverRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Autowired
	private CarRepository carRepositroy;
	
	@PostConstruct
	public void init(){
		
		Dispatcher di1 = new Dispatcher("BiljanaLukic", "Biljana", "Lukic", "female","123456789666", "123-4667", "Bilja@yahoo.com", "dispather");
		dispatcherRepository.save(di1);
		
		Customer cu1 = new Customer("TijanaLakic", "Tijana", "Lakic", "female", "1348758475", "789-4555", "tijana.@gmail", "customer");
		customerRepository.save(cu1);
		
		Location l1 = new Location();
		locationRepository.save(l1);
		
		Car c1 = new Car();
		carRepositroy.save(c1);
		
		Driver dr1 = new Driver("MilanStankovic", "Milan", "Stankovic", "male", "126126172678", "123-876","milan@gmail", "driver", l1, c1);
		driverRepository.save(dr1);
	}

}
