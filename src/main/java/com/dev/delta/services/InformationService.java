package com.dev.delta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.InformationHotel;
import com.dev.delta.repositories.InformationRepository;

@Service
public class InformationService {

	
	@Autowired
	private InformationRepository informationRepository;

	/**
	 * getFoods
	 * 
	 * @return
	 */
	public List<InformationHotel> getInformations() {
		return informationRepository.findAll();
	}
}
