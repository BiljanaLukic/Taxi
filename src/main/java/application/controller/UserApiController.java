package application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import application.dto.UserDTO;
import application.dto.UserRegistrationDTO;
import application.model.Customer;
import application.model.User;
import application.model.UserLogin;
import application.repository.UserRepository;
import application.service.UserService;
import application.utils.UserRegistrationDTOToUser;
import application.utils.UserToUserDTO;

@RestController
@RequestMapping (value = "api/users")
public class UserApiController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserToUserDTO toDto;
	@Autowired
	private UserRegistrationDTOToUser toUserReg;
	
	@RequestMapping (method = RequestMethod.POST, value = "/login")
	public ResponseEntity<UserDTO> returnUser (@RequestBody UserLogin userLogin){
		List<User> users = userService.findAll();
		User foundUser = null;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUsername().equals(userLogin.getUsername()) && users.get(i).getPassword().equals(userLogin.getPassword())){
				foundUser = users.get(i);
			}
		}
		
		if (foundUser==null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<> (toDto.convert(foundUser),HttpStatus.OK);
	}
	
	
	@RequestMapping (method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<UserDTO> findOne (@PathVariable Long id){
		User user = userService.findOne(id);
		return new ResponseEntity<> (toDto.convert(user),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<UserDTO> add (@RequestBody @Validated UserRegistrationDTO userReg){
		User user = toUserReg.convert(userReg);
		if (user==null){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		
			userService.save(user);
			
		
		return new ResponseEntity<>(toDto.convert(user),HttpStatus.CREATED);
	}
	
	
}
