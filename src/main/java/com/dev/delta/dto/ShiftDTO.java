package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.ShiftService;

@Service
public class ShiftDTO implements DTO {

	@Autowired
	ShiftService shiftService;
	
	@Override
	public void populate() {
		shift.setEnd("00:00");
		shift.setStart("06:00");
		shift.setType("Night Shift");
		shiftService.save(shift);
	}

}
