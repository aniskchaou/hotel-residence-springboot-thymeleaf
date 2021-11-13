package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.DepartementI18nRepository;
import com.dev.delta.repositories.DepartementRepository;

@Service
public class DepartementDTO implements DTO {

	@Autowired
	DepartementI18nRepository  departementI18nRepository;
	
	@Autowired
	DepartementRepository  departementRepository;
	
	@Override
	public void populate() {
		departement.setName("Administration");
		departementRepository.save(departement);
		
		departementI18n.setCreateTitleI18n("Create");
		departementI18n.setEditTitleI18n("Edit");
		departementI18n.setGetAllTitleI18n("Departements");
		departementI18n.setGetTitleI18n("Departement");
		departementI18n.setLangI18n("EN");
		departementI18n.setNameI18n("Name");
		
		departementI18n2.setCreateTitleI18n("Erstellen");
		departementI18n2.setEditTitleI18n("Bearbeiten");
		departementI18n2.setGetAllTitleI18n("Abteilungen");
		departementI18n2.setGetTitleI18n("Abteilungen");
		departementI18n2.setLangI18n("DE");
		departementI18n2.setNameI18n("Name");
		
		departementI18nRepository.save(departementI18n);
		departementI18nRepository.save(departementI18n2);

	}

}
