package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.AmenityRepository;

@Service
public class AmenityDTO implements DTO {

	@Autowired
	AmenityRepository amenityRepository;
	
	
	@Override
	public void populate() {
		
		amenity.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity.setName("Tea/Coffee Maker");
		amenity.setStatus("Active");
		

		amenity1.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity1.setName("LCD");
		amenity1.setStatus("Active");
		
		

		amenity2.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity2.setName("Parking");
		amenity2.setStatus("Active");
		
		

		amenity3.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity3.setName("Wifi");
		amenity3.setStatus("Active");
		
		

		amenity4.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity4.setName("Fitness Centre");
		amenity4.setStatus("Active");
		
		
		amenityRepository.save(amenity);
		amenityRepository.save(amenity1);
		amenityRepository.save(amenity2);
		amenityRepository.save(amenity3);
		amenityRepository.save(amenity4);
		
		
	}

}
