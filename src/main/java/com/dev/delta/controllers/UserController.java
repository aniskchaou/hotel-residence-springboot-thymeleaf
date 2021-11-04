package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.User;
import com.dev.delta.repositories.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository  userRepository;
	
	@GetMapping("/users")
	public String getUsers(Model model) {
		List<User> users = userRepository.findAll();	
		model.addAttribute("items", users);
		return "user/users";
	}
}
