package com.dev.delta.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Role;
import com.dev.delta.repositories.UserRepository;

@Service
public class UserDTO implements DTO {

	@Autowired
	UserRepository userRepository ;
	
	@Override
	public void populate() {
		Set<Role> list=new HashSet<>();
		user.setUsername("admin");
		user.setPassword("admin");
		user.setRole(role);
		userRepository.save(user);
		
		user1.setUsername("employee");
		user1.setPassword("employee");
		user1.setRole(role2);
		userRepository.save(user1);
		
		
		user3.setUsername("reception");
		user3.setPassword("reception");
		user3.setRole(role3);
		userRepository.save(user3);
		
		
		
	}

}
