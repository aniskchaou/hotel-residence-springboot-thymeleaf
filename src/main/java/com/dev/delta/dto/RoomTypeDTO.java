package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.RoomTypeRepository;

@Service
public class RoomTypeDTO implements DTO{

	@Autowired
	RoomTypeRepository roomTypeRepository;
	
	@Override
	public void populate() {
		
		roomType1.setTitle("Suite	Active");
		roomType2.setTitle("Deluxe Room");
		roomType3.setTitle("Regular Room");
		roomType1.setBasePrice("199");
		roomType2.setBasePrice("399");
		roomType3.setBasePrice("299");
		roomTypeRepository.save(roomType1);
		roomTypeRepository.save(roomType2);
		roomTypeRepository.save(roomType3);
		
		
		
		
	}

}
