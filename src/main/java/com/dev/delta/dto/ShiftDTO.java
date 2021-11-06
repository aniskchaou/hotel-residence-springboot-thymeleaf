package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ShiftI18nRepository;
import com.dev.delta.services.ShiftService;

@Service
public class ShiftDTO implements DTO {

	@Autowired
	ShiftService shiftService;
	
	@Autowired
	ShiftI18nRepository shiftI18nRepository;
	
	@Override
	public void populate() {
		shift.setEnd("00:00");
		shift.setStart("06:00");
		shift.setType("Night Shift");
		shiftService.save(shift);
		  
		shiftI18n.setStartI18n("Start");
		shiftI18n.setEndI18n("End");
		shiftI18n.setTypeI18n("Type");
		shiftI18n.setGetTitleI18n("City");
		shiftI18n.setCreateTitleI18n("Create new City");
		shiftI18n.setEditTitleI18n("Edit City");
		shiftI18n.setGetAllTitleI18n("Cities");
		
		shiftI18n2.setStartI18n("Start");
		shiftI18n2.setEndI18n("End");
		shiftI18n2.setTypeI18n("Type");
		shiftI18n2.setGetTitleI18n("City");
		shiftI18n2.setCreateTitleI18n("Create new City");
		shiftI18n2.setEditTitleI18n("Edit City");
		shiftI18n2.setGetAllTitleI18n("Cities");
		
		shiftI18nRepository.save(shiftI18n);
		shiftI18nRepository.save(shiftI18n2);
	}

}
