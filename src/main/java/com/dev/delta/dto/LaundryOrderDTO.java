package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.LaundryOrderI18nRepository;
import com.dev.delta.repositories.LaundryOrderRepository;

@Service
public class LaundryOrderDTO implements DTO {

	@Autowired
	LaundryOrderI18nRepository  laundryOrderI18nRepository;
	
	@Autowired
	LaundryOrderRepository   laundryOrderRepository;
	
	@Override
	public void populate() {
		laundryOrder.setDate(new Date().toString());
		
		laundryOrder.setLaundryitem("T shirt");
		laundryOrder.setRoom(room);
		
		laundryOrderRepository.save(laundryOrder);
		
		laundryOrderI18n.setDateI18n("Date");
		laundryOrderI18n.setLangI18n("EN");
		laundryOrderI18n.setLaundryitemI18n("Laundry Item");
		laundryOrderI18n.setRoomI18n("Room");
		laundryOrderI18n.setCreateTitleI18n("Create");
		laundryOrderI18n.setEditTitleI18n("Edit");
		laundryOrderI18n.setGetAllTitleI18n("Laundry Orders");
		laundryOrderI18n.setGetTitleI18n("Laundry Order");
		laundryOrderI18nRepository.save(laundryOrderI18n);
		
		laundryOrderI18n2.setDateI18n("Datum");
		laundryOrderI18n2.setLangI18n("DE");
		laundryOrderI18n2.setLaundryitemI18n("Wäscheartikel");
		laundryOrderI18n2.setRoomI18n("Zimmer");
		laundryOrderI18n.setCreateTitleI18n("Erstellen");
		laundryOrderI18n.setEditTitleI18n("Bearbeiten");
		laundryOrderI18n.setGetAllTitleI18n("Wäschebestellungen");
		laundryOrderI18n.setGetTitleI18n("Wäschebestellung");
		laundryOrderI18nRepository.save(laundryOrderI18n2);
		
		
		

	}

}
