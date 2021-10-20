package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.GuestTypeRepository;

@Service
public class GuestTypeDTO implements DTO{

	@Autowired
	GuestTypeRepository guestTypeRepository;
	
	@Override
	public void populate() {
		guestType1.setName("Normal");
		guestType2.setName("Business");
		guestTypeRepository.save(guestType1);
		guestTypeRepository.save(guestType2);
		
	}

	
}
