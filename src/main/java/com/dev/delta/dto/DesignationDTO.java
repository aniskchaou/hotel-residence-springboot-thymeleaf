package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.DesignationI18nRepository;
import com.dev.delta.services.DesignationService;

@Service
public class DesignationDTO implements DTO {

	@Autowired
	DesignationService designationService;

	@Autowired
	DesignationI18nRepository designationI18nRepository;

	@Override
	public void populate() {
		designation.setName("Receptionist");

		designationI18n.setNameI18n("Name");
		designationI18n.setGetTitleI18n("City");
		designationI18n.setCreateTitleI18n("Create new City");
		designationI18n.setEditTitleI18n("Edit City");
		designationI18n.setGetAllTitleI18n("Cities");
		designationI18n.setLangI18n("EN");
		designationI18nRepository.save(designationI18n);

		designationI18n2.setNameI18n("Name");
		designationI18n2.setGetTitleI18n("City");
		designationI18n2.setCreateTitleI18n("Create new City");
		designationI18n2.setEditTitleI18n("Edit City");
		designationI18n2.setGetAllTitleI18n("Cities");
		designationI18n2.setLangI18n("EN");
		designationI18nRepository.save(designationI18n2);

		designationService.save(designation);

	}

}
