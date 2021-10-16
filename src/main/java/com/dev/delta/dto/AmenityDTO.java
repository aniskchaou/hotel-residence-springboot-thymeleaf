package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Amenity;
import com.dev.delta.repositories.AmenityRepository;

@Service
public class AmenityDTO implements DTO {

	@Autowired
	AmenityRepository amenityRepository;
	
	
	@Override
	public void populate() {
		Amenity amenity=new Amenity();
		amenity.setDescription(":kbhlkhbkh");
		amenity.setName("LCD");
		amenity.setStatus("Active");
		amenityRepository.save(amenity);
		
	}

}
