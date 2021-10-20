package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.BedService;

@Service
public class BedDTO implements DTO{

	@Autowired
	BedService bedService;
	
	@Override
	public void populate() {
		bed.setName("102");
		bed.setStatus("Active");
		bedService.save(bed);
		
	}

}
