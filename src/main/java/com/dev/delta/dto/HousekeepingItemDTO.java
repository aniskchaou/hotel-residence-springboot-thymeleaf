package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.HouseKeepingItemI18nRepository;

@Service
public class HousekeepingItemDTO implements DTO {

	@Autowired
	HouseKeepingItemI18nRepository  houseKeepingItemI18nRepository;
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		houseKeepingItemI18n.setNameI18n("Name");
		houseKeepingItemI18n.setGetAllTitleI18n("HouseKeeping Items");
		houseKeepingItemI18n.setCreateTitleI18n("Create");
		houseKeepingItemI18n.setEditTitleI18n("Edit");
		houseKeepingItemI18n.setGetTitleI18n("HouseKeeping");
		houseKeepingItemI18n.setLangI18n("EN");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n);
		
		houseKeepingItemI18n2.setNameI18n("Name");
		houseKeepingItemI18n2.setGetAllTitleI18n("Hauswirtschaften");
		houseKeepingItemI18n2.setCreateTitleI18n("Erstellen");
		houseKeepingItemI18n2.setEditTitleI18n("Bearbeiten");
		houseKeepingItemI18n2.setGetTitleI18n("Hauswirtschaft");
		houseKeepingItemI18n2.setLangI18n("DE");
		houseKeepingItemI18nRepository.save(houseKeepingItemI18n2);
	}

}
