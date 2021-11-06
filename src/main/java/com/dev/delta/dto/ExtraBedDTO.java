package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExtraBedI18nRepository;
import com.dev.delta.repositories.ExtraBedRepository;

@Service
public class ExtraBedDTO implements DTO{

	@Autowired
	ExtraBedRepository  extraBedRepository;
	
	@Autowired
	ExtraBedI18nRepository extraBedI18nRepository ;
	
	@Override
	public void populate() {
		extraBed.setBedNo("103");
		extraBed.setComment("kjkj");
		extraBed.setRoom(room);
		extraBed.setExtraBed("1");
		
		extraBedRepository.save(extraBed);
		
		extraBedI18n.setBedNoI18n("103");
		extraBedI18n.setCommentI18n("kjkj");
		extraBedI18n.setRoomI18n("");
		extraBedI18n.setExtraBedI18n("1");
		extraBedI18n.setGetTitleI18n("City");
		extraBedI18n.setCreateTitleI18n("Create new City");
		extraBedI18n.setEditTitleI18n("Edit City");
		extraBedI18n.setGetAllTitleI18n("Cities");
		extraBedI18n.setLangI18n("EN");
		extraBedI18nRepository.save(extraBedI18n);
		
		
		extraBedI18n2.setBedNoI18n("103");
		extraBedI18n2.setCommentI18n("kjkj");
		extraBedI18n2.setRoomI18n("");
		extraBedI18n2.setExtraBedI18n("1");
		extraBedI18n2.setGetTitleI18n("City");
		extraBedI18n2.setCreateTitleI18n("Create new City");
		extraBedI18n2.setEditTitleI18n("Edit City");
		extraBedI18n2.setGetAllTitleI18n("Cities");
		extraBedI18n2.setLangI18n("EN");
		extraBedI18nRepository.save(extraBedI18n2);
		
		
		
		
	}

}
