package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CountryRepository;

@Service
public class CountryDTO implements DTO{

	
	@Autowired
	CountryRepository countryRepository;
	
	@Override
	public void populate() {
		country.setName("France");
		countryRepository.save(country);
		
	}

}
