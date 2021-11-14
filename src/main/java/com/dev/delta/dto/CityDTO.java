package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CityI18nRepository;
import com.dev.delta.repositories.CityRepository;

@Service
public class CityDTO implements DTO{

	@Autowired
	CityRepository cityRepository;

	@Autowired
	CityI18nRepository cityI18nRepository;
	
	
	@Override
	public void populate() {
      city.setName("Paris");
      cityRepository.save(city);
		
      cityI18n.setLangI18n("EN");
      cityI18n.setNameI18n("Name");
      cityI18n.setGetAllTitleI18n("Cities");
      cityI18n.setCreateTitleI18n("Create new City");
      cityI18n.setEditTitleI18n("Edit City");
      cityI18n.setGetTitleI18n("City");
      cityI18n.setCreateTitleI18n("Create new City");
      cityI18n.setEditTitleI18n("Edit City");
      cityI18n.setGetAllTitleI18n("Cities");
      cityI18nRepository.save(cityI18n);
      
      
      cityI18n2.setGetAllTitleI18n("Städte");
      cityI18n2.setCreateTitleI18n("Erstellen");
      cityI18n2.setEditTitleI18n("Bearbeiten");
      cityI18n2.setGetTitleI18n("Städte");
      cityI18n2.setLangI18n("DE");
      cityI18n2.setNameI18n("Name");

      cityI18nRepository.save(cityI18n2);
		
	}

}
