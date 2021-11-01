package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.CheckInService;

@Service
public class CheckInDTO implements DTO {

	@Autowired
	CheckInService   checkInService;
	
	@Override
	public void populate() {
		Date dt = new Date();

		checkIn.setCheckIn(new Date().toString());
		checkIn.setCheckOut(dt.toString());
		checkIn.setCity(city);
		checkIn.setCountry(country);
		checkIn.setFullname("John Doe");
		checkIn.setEmail("contact@gmail.com");
		checkIn.setRoom(room);
		checkIn.setGuestType(guestType1);
		checkInService.save(checkIn);
	}

}
