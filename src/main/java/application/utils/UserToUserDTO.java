package application.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import application.dto.UserDTO;
import application.model.User;
@Component
public class UserToUserDTO implements Converter<User, UserDTO>{

	@Override
	public UserDTO convert(User u) {
		UserDTO dto = new UserDTO();
		dto.setEmail(u.getEmail());
		dto.setGender(u.getGender());
		dto.setId(u.getId());
		dto.setPersonalIdNum(u.getPersonalIdNum());
		dto.setName(u.getName());
		dto.setPhone(u.getPhone());
		dto.setRole(u.getRole());
		dto.setSurname(u.getSurname());
		dto.setUsername(u.getUsername());
		return dto;
	}
	
	
}
