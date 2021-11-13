package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExtraBedRequestI18nRepository;
import com.dev.delta.repositories.ExtraBedRequestRepository;


@Service
public class ExtraBedRequestDTO implements DTO {

	@Autowired
	ExtraBedRequestI18nRepository  extraBedRequestI18nRepository;
	
	@Autowired
	ExtraBedRequestRepository  extraBedRequestRepository;
	
	@Override
	public void populate() {
		extraBedRequestOrder.setComment("");
		extraBedRequestOrder.setCustomer(customer);
		extraBedRequestOrder.setDate(new Date().toString());
		extraBedRequestOrder.setExtraBed("2");
		extraBedRequestOrder.setRoom(room);
		extraBedRequestOrder.setStatus("Accepted");
		extraBedRequestRepository.save(extraBedRequestOrder);
		
		
		extraBedRequestI18n.setExtraBed("Extra Bed");
		extraBedRequestI18n.setComment("Comment");;
		extraBedRequestI18n.setDate(new Date().toString());
		extraBedRequestI18n.setLangI18n("EN");
		extraBedRequestI18n.setCustomer("Customer");
		extraBedRequestI18n.setRoom("Room");
		extraBedRequestI18n.setStatus("Status");
		extraBedRequestI18nRepository.save(extraBedRequestI18n);
		
		extraBedRequestI18n2.setExtraBed("Extrabett");
		extraBedRequestI18n2.setComment("Kommentare");;
		extraBedRequestI18n2.setDate(new Date().toString());
		extraBedRequestI18n2.setLangI18n("DE");
		extraBedRequestI18n2.setCustomer("Kunde");
		extraBedRequestI18n2.setRoom("Zimmer");
		extraBedRequestI18n2.setStatus("Status");
		extraBedRequestI18nRepository.save(extraBedRequestI18n2);
	}

}
