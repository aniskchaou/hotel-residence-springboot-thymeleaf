package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.EmployeeService;

@Service
public class EmployeeDTO implements DTO{

	@Autowired
	EmployeeService employeeService;
	
	@Override
	public void populate() {
	 
		employeeService.save(null);
		
	}

	
	
}
