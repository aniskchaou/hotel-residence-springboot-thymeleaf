package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.GuestTypeI18nRepository;
import com.dev.delta.repositories.GuestTypeRepository;

@Service
public class GuestTypeDTO implements DTO {

	@Autowired
	GuestTypeRepository guestTypeRepository;

	@Autowired
	GuestTypeI18nRepository guestTypeI18nRepository;

	@Override
	public void populate() {
		guestType1.setName("Normal");
		guestType2.setName("Business");
		guestTypeRepository.save(guestType1);
		guestTypeRepository.save(guestType2);

		guestTypeI18n.setNameI18n("Normal");
		guestTypeI18n.setGetTitleI18n("City");
		guestTypeI18n.setCreateTitleI18n("Create new City");
		guestTypeI18n.setEditTitleI18n("Edit City");
		guestTypeI18n.setGetAllTitleI18n("Cities");
		guestTypeI18n.setLangI18n("EN");
		guestTypeI18nRepository.save(guestTypeI18n);

		guestTypeI18n2.setNameI18n("Normal");
		guestTypeI18n2.setGetTitleI18n("City");
		guestTypeI18n2.setCreateTitleI18n("Create new City");
		guestTypeI18n2.setEditTitleI18n("Edit City");
		guestTypeI18n2.setGetAllTitleI18n("Cities");
		guestTypeI18n2.setLangI18n("DE");
		guestTypeI18nRepository.save(guestTypeI18n2);
	}

}
