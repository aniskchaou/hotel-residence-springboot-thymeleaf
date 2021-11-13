package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.entities.AmenityI18n;
import com.dev.delta.i18n.repositories.AmenityI18nRepository;
import com.dev.delta.repositories.AmenityRepository;

@Service
public class AmenityDTO implements DTO {

	@Autowired
	AmenityRepository amenityRepository;
	
	@Autowired
	AmenityI18nRepository amenityI18nRepository;
	
	@Override
	public void populate() {
		
		amenityI18n.setLanguageI18n("DE");
		amenityI18n.setDescriptionI18n("Beschreibung");
		amenityI18n.setNameI18n("Namen");
		amenityI18n.setStatusI18n("Stellung");
		amenityI18n.setGetTitleI18n("Stadt");
		amenityI18n.setCreateTitleI18n("Erstellen");
		amenityI18n.setEditTitleI18n("Bearbeiten");
		amenityI18n.setGetAllTitleI18n("Städte");
		
		amenityI18n2.setLanguageI18n("EN");
		amenityI18n2.setDescriptionI18n("Description");
		amenityI18n2.setNameI18n("Name");
		amenityI18n2.setStatusI18n("Status");
		amenityI18n2.setGetTitleI18n("City");
		amenityI18n2.setCreateTitleI18n("Create");
		amenityI18n2.setEditTitleI18n("Edit");
		amenityI18n2.setGetAllTitleI18n("Cities");
		
		amenityI18nRepository.save(amenityI18n);
		amenityI18nRepository.save(amenityI18n2);
		
		
		amenity.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity.setName("Tea/Coffee Maker");
		amenity.setStatus("Active");
		

		amenity1.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity1.setName("LCD");
		amenity1.setStatus("Active");
		
		

		amenity2.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity2.setName("Parking");
		amenity2.setStatus("Active");
		
		

		amenity3.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity3.setName("Wifi");
		amenity3.setStatus("Active");
		
		

		amenity4.setDescription("Suspendisse sem ex, mattis ut luctus ac, bibendum in metus");
		amenity4.setName("Fitness Centre");
		amenity4.setStatus("Active");
		
		
		amenityRepository.save(amenity);
		amenityRepository.save(amenity1);
		amenityRepository.save(amenity2);
		amenityRepository.save(amenity3);
		amenityRepository.save(amenity4);
		
		
	}

}
