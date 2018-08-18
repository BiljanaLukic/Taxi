package application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.User;
import application.repository.UserRepository;
import application.service.UserService;

@Service
public class JpaUserService implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		
		return userRepository.findOne(id);
	}

	@Override
	public User save(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		userRepository.delete(id);
		
	}

}
