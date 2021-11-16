package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodRequestI18nRepository;
import com.dev.delta.repositories.FoodOrderRequestRepository;

@Service
public class FoodRequestDTO implements DTO {

	@Autowired
	FoodRequestI18nRepository  foodRequestI18nRepository;
	
	@Autowired
	FoodOrderRequestRepository   foodOrderRequestRepository;
	
	@Override
	public void populate() {
		
		foodRequestI18n.setCustomer("Customer");
		foodRequestI18n.setDate("Date");
		foodRequestI18n.setFoodItem("Food Item");
		foodRequestI18n.setNoofPersons("Persons");
		foodRequestI18n.setRoom("Room");
		foodRequestI18n.setStatus("Status");
		foodRequestI18n.setLangI18n("EN");
		foodRequestI18nRepository.save(foodRequestI18n);
		
		
		foodRequestI18n2.setCustomer("Kunde");
		foodRequestI18n2.setDate("Datum");
		foodRequestI18n2.setFoodItem("Lebensmittel");
		foodRequestI18n2.setNoofPersons("Personen");
		foodRequestI18n2.setRoom("Zimmer");
		foodRequestI18n2.setStatus("Status");
		foodRequestI18n2.setLangI18n("DE");
		foodRequestI18nRepository.save(foodRequestI18n2);
		
		foodRequestOrder.setCustomer(customer);
		foodRequestOrder.setDate(new Date().toString());
		foodRequestOrder.setFoodItem("Pizza");
		foodRequestOrder.setNoofPersons("Persons");
		foodRequestOrder.setRoom(room);
		foodRequestOrder.setStatus("Status");
		foodOrderRequestRepository.save(foodRequestOrder);
		
		

	}

}
