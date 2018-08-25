package application.utils;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import application.dto.DrivingDTO;
import application.model.Customer;
import application.model.Driving;
import application.model.Driving.Status;
import application.service.UserService;

@Component
public class DrivingDTOToDriving implements Converter<DrivingDTO, Driving>{
	@Autowired
	private UserService userService;

	@Override
	public Driving convert(DrivingDTO dto) {
		Driving driving = new Driving();
		driving.setAddress(dto.getAddress());
		Customer customer = (Customer) userService.findOne(dto.getCustomerId());
		driving.setCustomer(customer);
		return driving;
	}

}
