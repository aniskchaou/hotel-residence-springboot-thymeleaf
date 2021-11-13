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
		bedI18n.setNameI18n("Bed Number");
		bedI18n.setStatusI18n("Status");	
		bedI18n.setGetTitleI18n("City");
		bedI18n.setCreateTitleI18n("Create new City");
		bedI18n.setEditTitleI18n("Edit City");
		bedI18n.setGetAllTitleI18n("Cities");
	      
		bedI18nRepository.save(bedI18n);
		
		bedI18n2.setLangI18n("DE");
		bedI18n2.setNameI18n("Bettnummer");
		bedI18n2.setStatusI18n("Stellung");
		bedI18n2.setGetTitleI18n("Stadt");
		bedI18n2.setCreateTitleI18n("Erstellen");
		bedI18n2.setEditTitleI18n("Bearbeiten");
		bedI18n2.setGetAllTitleI18n("Betten");
		bedI18nRepository.save(bedI18n2);
		
	}

}
