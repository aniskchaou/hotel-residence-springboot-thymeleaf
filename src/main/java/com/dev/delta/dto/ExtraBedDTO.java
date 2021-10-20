package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ExtraBedRepository;

@Service
public class ExtraBedDTO implements DTO{

	@Autowired
	ExtraBedRepository  extraBedRepository;
	
	@Override
	public void populate() {
		extraBed.setBedNo("103");
		extraBed.setComment("kjkj");
		extraBed.setCustomer(customer);
		extraBed.setRoom(room);
		extraBed.setRoomType(roomType1);
		extraBed.setExtraBed("1");
		
		extraBedRepository.save(extraBed);
		
	}

}
