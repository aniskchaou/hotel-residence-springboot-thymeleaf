package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CityRepository;

@Service
public class CityDTO implements DTO{

	@Autowired
	CityRepository cityRepository;
	
	@Override
	public void populate() {
      city.setName("Paris");
      cityRepository.save(city);
		
		
	}

}
