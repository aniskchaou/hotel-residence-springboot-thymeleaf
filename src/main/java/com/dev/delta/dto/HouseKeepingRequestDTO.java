package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;
import com.dev.delta.i18n.repositories.HouseKeepingRequestI18nRepository;
import com.dev.delta.repositories.HouseKeepingRequestRepository;

@Service
public class HouseKeepingRequestDTO implements DTO {

	
	@Autowired
	HouseKeepingRequestRepository   houseKeepingRequestOrderRepository;
	
	@Autowired
	HouseKeepingRequestI18nRepository  houseKeepingRequestI18nRepository;
	
	
	@Override
	public void populate() {
		houseKeepingRequestI18n.setCustomer("Customer");
		houseKeepingRequestI18n.setDate("Date");
		houseKeepingRequestI18n.setLangI18n("EN");
		houseKeepingRequestI18n.setRoom("Room");
		houseKeepingRequestI18n.setStatus("Status");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n);
		
		
		houseKeepingRequestI18n2.setCustomer("Kunde");
		houseKeepingRequestI18n2.setDate("Datum");
		houseKeepingRequestI18n2.setLangI18n("DE");
		houseKeepingRequestI18n2.setRoom("Zimmer");
		houseKeepingRequestI18n2.setStatus("Status");
		houseKeepingRequestI18nRepository.save(houseKeepingRequestI18n2);
		
		
		houseKeepingRequestOrder.setCustomer(customer);
		houseKeepingRequestOrder.setDate(new Date().toString());
		houseKeepingRequestOrder.setRoom(room);
		houseKeepingRequestOrder.setStatus("Status");
		houseKeepingRequestOrderRepository.save(houseKeepingRequestOrder);
		

	}

}
