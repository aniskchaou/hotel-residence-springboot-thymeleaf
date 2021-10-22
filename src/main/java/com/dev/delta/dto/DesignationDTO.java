package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.DesignationService;

@Service
public class DesignationDTO implements DTO {

	@Autowired
	DesignationService  designationService;
	
	@Override
	public void populate() {
		designation.setName("Receptionist");
		
		designationService.save(designation);

	}

}
