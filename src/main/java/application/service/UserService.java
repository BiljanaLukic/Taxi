package application.service;

import java.util.List;


import application.model.User;

public interface UserService {
	
	List<User> findAll();
	User findOne (Long id);
	User save (User user);
	void delete (Long id);
}
