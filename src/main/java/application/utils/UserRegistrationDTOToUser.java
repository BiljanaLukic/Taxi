package application.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import application.dto.UserRegistrationDTO;
import application.model.Customer;
import application.model.Driver;
import application.model.User;

@Component
public class UserRegistrationDTOToUser implements Converter<UserRegistrationDTO, User>{

	@Override
	public User convert(UserRegistrationDTO dto) {
		
		if (!dto.getPassword1().equals(dto.getPassword2())){
			return null;
		}
		
		User user;
		if (dto.getRole() == null){
			user = new Customer();
			user.setRole("customer");
		}else{
			user = new Driver();
			user.setRole("driver");
		}
		
		
		
		user.setEmail(dto.getEmail());
		user.setGender(dto.getGender());
		user.setId(dto.getId());
		user.setPersonalIdNum(dto.getPersonalIdNum());
		user.setName(dto.getName());
		user.setUsername(dto.getUsername());
		user.setPhone(dto.getPhone());
		user.setRole(dto.getRole());
		user.setSurname(dto.getSurname());
		user.setPassword(dto.getPassword1());
		return user;
	}

}
