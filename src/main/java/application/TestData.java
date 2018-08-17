package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.stereotype.Component;

import application.model.Car;
import application.model.Customer;
import application.model.Dispatcher;
import application.model.Driver;
import application.model.Driving;
import application.model.Driving.Status;
import application.repository.CarRepository;
import application.repository.CustomerRepository;
import application.repository.DispatcherRepository;
import application.repository.DriverRepository;
import application.service.DrivingService;


@Component
public class TestData {
	@Autowired
	private DispatcherRepository dispatcherRepository;
	@Autowired
	private DriverRepository driverRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CarRepository carRepositroy;
	@Autowired
	private DrivingService drivingService;
	
	@PostConstruct
	public void init(){
		
		Dispatcher di1 = new Dispatcher("BiljanaLukic", "Biljana", "Lukic", "female","123456789666", "123-4667", "Bilja@yahoo.com", "dispather", "biljana");
		dispatcherRepository.save(di1);
		
		Customer cu1 = new Customer("TijanaLakic", "Tijana", "Lakic", "female", "1348758475", "789-4555", "tijana.@gmail", "customer", "tijana");
		Customer cu2 = new Customer("StefanDjuric", "Stefan", "Djuric", "male", "567785746", "889-9887", "stefan.@gmail", "customer", "stefan");
		customerRepository.save(cu1);
		customerRepository.save(cu2);
		
		Car c1 = new Car();
		carRepositroy.save(c1);
		
		Driver dr1 = new Driver("MilanStankovic", "Milan", "Stankovic", "male", "126126172678", "123-876","milan@gmail", "driver", c1, "milan");
		driverRepository.save(dr1);
		System.out.println(c1);
		
		
		Driving driv1 = new Driving(dr1, null , "Kraljevica Marka 40, Novi Sad", cu1, null, 300.00, null,Status.USPESNA);
		Driving driv2 = new Driving(dr1, null , "Fruskogorska 67, Novi Sad", cu1, null, 800.00, null,Status.USPESNA);
		Driving driv3 = new Driving(dr1, null , "Kralja Petra 67, Novi Sad", cu2, null, 500.00, null,Status.USPESNA);
		 drivingService.save(driv1);
		 drivingService.save(driv2);
		 drivingService.save(driv3);
	}

}
