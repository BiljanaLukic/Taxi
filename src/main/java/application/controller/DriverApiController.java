package application.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.model.Driver;
import application.repository.DriverRepository;

@RestController
@RequestMapping (value = "/api/drivers")
public class DriverApiController {
	
	@Autowired
	private DriverRepository driverRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Driver>> getAll (){
		List<Driver> drivers = driverRepository.findAll();
		return new ResponseEntity<>(drivers,HttpStatus.OK);
	}

}
