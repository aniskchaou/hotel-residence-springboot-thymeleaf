package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.UserRepository;

@Service
public class UserDTO implements DTO {

	@Autowired
	UserRepository userRepository ;
	
	@Override
	public void populate() {
		user.setUsername("admin");
		user.setPassword("admin");
		userRepository.save(user);
		
		user1.setUsername("employee");
		user1.setPassword("employee");
		userRepository.save(user1);
	}

}
