package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.RoomTypeI18nRepository;
import com.dev.delta.repositories.RoomTypeRepository;

@Service
public class RoomTypeDTO implements DTO{

	@Autowired
	RoomTypeRepository roomTypeRepository;
	
	@Autowired
	RoomTypeI18nRepository roomTypeI18nRepository  ;
	
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
		
		  roomTypeI18n.setBasePriceI18n("");
		  roomTypeI18n.setTitleI18n("");
		  roomTypeI18n.setGetTitleI18n("City");
		  roomTypeI18n.setCreateTitleI18n("Create new City");
		  roomTypeI18n.setEditTitleI18n("Edit City");
		  roomTypeI18n.setGetAllTitleI18n("Cities");
		  roomTypeI18n.setLangI18n("EN");
		  roomTypeI18nRepository.save(roomTypeI18n);
		  
		  roomTypeI18n2.setBasePriceI18n("");
		  roomTypeI18n2.setTitleI18n("");
		  roomTypeI18n2.setGetTitleI18n("City");
		  roomTypeI18n2.setCreateTitleI18n("Create new City");
		  roomTypeI18n2.setEditTitleI18n("Edit City");
		  roomTypeI18n2.setGetAllTitleI18n("Cities");
		  roomTypeI18n2.setLangI18n("DE");
		  roomTypeI18nRepository.save(roomTypeI18n2);
		
		
		
		
	}

}
