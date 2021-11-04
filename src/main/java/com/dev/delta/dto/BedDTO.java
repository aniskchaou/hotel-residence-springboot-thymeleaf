package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BedI18nRepository;
import com.dev.delta.services.BedService;

@Service
public class BedDTO implements DTO{

	@Autowired
	BedService bedService;
	
	@Autowired
	BedI18nRepository bedI18nRepository;
	
	@Override
	public void populate() {
		bed.setName("102");
		bed.setStatus("Active");
		bedService.save(bed);
		
		bedI18n.setLangI18n("EN");
		bedI18n.setNameI18n("Bed No");
		bedI18n.setStatusI18n("Status");
		
		bedI18nRepository.save(bedI18n);
		
	}

}
