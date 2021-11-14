package com.dev.delta.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Role;
import com.dev.delta.i18n.repositories.UserI18nRepository;
import com.dev.delta.repositories.UserRepository;

@Service
public class UserDTO implements DTO {

	@Autowired
	UserRepository userRepository ;
	
	@Autowired
	UserI18nRepository  userI18nRepository;
	
	@Override
	public void populate() {

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
		
		userI18n.setRoleI18n("Role");
		userI18n.setUsernameI18n("Username");
		userI18n.setLangI18n("EN");
		userI18n.setGetAllTitleI18n("Cities");
		userI18n.setCreateTitleI18n("Create new City");
		userI18n.setEditTitleI18n("Edit City");
		userI18n.setGetTitleI18n("City");
		userI18nRepository.save(userI18n);
		
		
		userI18n2.setRoleI18n("Rolle");
		userI18n2.setUsernameI18n("Nutzername");
		userI18n2.setLangI18n("DE");
		userI18n2.setGetAllTitleI18n("Benutzer");
		userI18n2.setCreateTitleI18n("Erstellen");
		userI18n2.setEditTitleI18n("Bearbeiten");
		userI18n2.setGetTitleI18n("Benutzer");
		
		userI18nRepository.save(userI18n2);
		
		
	}

}
