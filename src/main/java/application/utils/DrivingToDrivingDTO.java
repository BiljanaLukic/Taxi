package application.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import application.dto.DrivingDTO;
import application.model.Driving;
@Component
public class DrivingToDrivingDTO implements Converter<Driving, DrivingDTO>{

	@Override
	public DrivingDTO convert(Driving d) {
		DrivingDTO dto = new DrivingDTO();
		dto.setAddress(d.getAddress());
		dto.setAmount(d.getAmount());
		dto.setComment(d.getComment());
		if (d.getCustomer()!=null){
			dto.setCustomerId(d.getCustomer().getId());
			dto.setCustomerName(d.getCustomer().getName());
		}
		
		if (d.getDispather()!=null){
		dto.setDispatcherId(d.getDispather().getId());
		dto.setDispatcherName(d.getDispather().getName());
		}
		if (d.getDriver()!=null){
		dto.setDriverId(d.getDriver().getId());
		dto.setDriverName(d.getDriver().getName());
		}
		dto.setId(d.getId());
		dto.setStatus(d.getStatus());
		dto.setTimeOfOrdering(d.getTimeOfOrdering());
		return dto;
	}
	
	public List<DrivingDTO> convert (List<Driving> drivings){
		List<DrivingDTO> dtos = new ArrayList<>();
		for (Driving d: drivings){
			dtos.add(convert(d));
		}
		return dtos;
		
	}
	
	
}
