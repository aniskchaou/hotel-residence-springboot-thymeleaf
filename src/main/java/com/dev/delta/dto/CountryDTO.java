package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CountryI18nRepository;
import com.dev.delta.repositories.CountryRepository;

@Service
public class CountryDTO implements DTO{

	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	CountryI18nRepository   countryI18nRepository;
	
	@Override
	public void populate() {
		country.setName("France");
		countryRepository.save(country);
		
		countryI18n.setLangI18n("EN");
		countryI18n.setNameI18n("Name");
		countryI18n.setCreateTitleI18n("Create new Country");
		countryI18n.setEditTitleI18n("Edit Country");
		countryI18n.setGetAllTitleI18n("Countries");
		countryI18n.setCreateTitleI18n("Create new Country");
		countryI18nRepository.save(countryI18n);
		
		countryI18n2.setLangI18n("DE");
		countryI18n2.setNameI18n("Land");
		countryI18n2.setCreateTitleI18n("Erstellen");
		countryI18n2.setEditTitleI18n("Bearbeiten");
		countryI18n2.setGetAllTitleI18n("Länder");
		countryI18n2.setCreateTitleI18n("Erstellen");
		countryI18nRepository.save(countryI18n2);
		
	}

}
