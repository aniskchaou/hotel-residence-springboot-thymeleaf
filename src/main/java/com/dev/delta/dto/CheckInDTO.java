package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CheckInI18nRepository;
import com.dev.delta.services.CheckInService;

@Service
public class CheckInDTO implements DTO {

	@Autowired
	CheckInService   checkInService;
	
	@Autowired
	CheckInI18nRepository  checkInI18nRepository;
	
	@Override
	public void populate() {
		Date dt = new Date();

		checkIn.setCheckIn(new Date().toString());
		checkIn.setCheckOut(dt.toString());
		checkIn.setCity(city);
		checkIn.setCountry(country);
		checkIn.setFullname("John Doe");
		checkIn.setEmail("contact@gmail.com");
		checkIn.setRoom(room);
		checkIn.setGuestType(guestType1);
		checkIn.setCutomer(customer);
		checkInService.save(checkIn);
		
		
		
		checkInI18n.setCheckInI18n("Check In");
		checkInI18n.setCheckOutI18n("Check Out");
		checkInI18n.setCityI18n("City");
		checkInI18n.setCountryI18n("Country");
		checkInI18n.setFullnameI18n("Fullname");
		checkInI18n.setEmailI18n("Email");
		checkInI18n.setRoomI18n("Room");
		checkInI18n.setGuestTypeI18n("Guest Type");
		checkInI18n.setCutomerI18n("Customer");
		checkInI18n.setLangI18n("EN");
		checkInI18n.setGetTitleI18n("City");
		checkInI18n.setCreateTitleI18n("Create new City");
		checkInI18n.setEditTitleI18n("Edit City");
		checkInI18n.setGetAllTitleI18n("Cities");
		checkInI18nRepository.save(checkInI18n);
		
		checkInI18n2.setCheckInI18n("Einchecken");
		checkInI18n2.setCheckOutI18n("Auschecken");
		checkInI18n2.setCityI18n("Stadt");
		checkInI18n2.setCountryI18n("Land");
		checkInI18n2.setFullnameI18n("Vollständiger Name");
		checkInI18n2.setEmailI18n("Email");
		checkInI18n2.setRoomI18n("Zimmer");
		checkInI18n2.setGuestTypeI18n("Kundentyp");
		checkInI18n2.setCutomerI18n("Kunde");
		checkInI18n2.setLangI18n("DE");
		checkInI18n2.setGetTitleI18n("City");
		checkInI18n2.setCreateTitleI18n("Create new City");
		checkInI18n2.setEditTitleI18n("Edit City");
		checkInI18n2.setGetAllTitleI18n("Cities");
		checkInI18nRepository.save(checkInI18n2);
	}

}
