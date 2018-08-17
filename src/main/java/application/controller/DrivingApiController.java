package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import application.dto.DrivingDTO;
import application.model.Driving;
import application.service.DrivingService;
import application.utils.DrivingToDrivingDTO;

@RestController
@RequestMapping(value = "/api/drivings")
public class DrivingApiController {
	@Autowired
	private DrivingService drivingService;
	@Autowired
	private DrivingToDrivingDTO toDto;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<DrivingDTO>> getAll (@RequestParam(required = false) Long idUser){
		
		List<Driving> drivings;
		
		if (idUser != null){
			drivings = drivingService.pretraga(idUser);
		}else {
			drivings = drivingService.findAll();
		}
		return new ResponseEntity<>(toDto.convert(drivings),HttpStatus.OK);
		
	}
}
