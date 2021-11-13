package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodI18nRepository;
import com.dev.delta.i18n.repositories.FoodOrderI18nRepository;
import com.dev.delta.repositories.FoodOrderRespository;

@Service
public class FoodOrderDTO implements DTO {

	@Autowired
	FoodOrderI18nRepository  foodI18nRepository;
	
	@Autowired
	FoodOrderRespository    foodOrderRespository;
	
	
	@Override
	public void populate() {
		
		foodOrder.setCheckin(checkIn);
		foodOrder.setFoodItem(food);
		foodOrder.setNoofPersons("1");
		foodOrder.setPrice("33");
		foodOrder.setRoom(room);
		foodOrder.setWaiterName("John Doe");
		
		foodOrderRespository.save(foodOrder);
		
		foodOrderI18n.setCheckinI18n("Check in");
		foodOrderI18n.setFoodItemI18n("Food Item");
		foodOrderI18n.setLangI18n("EN");
		foodOrderI18n.setNoofPersonsI18n("Persons");
		foodOrderI18n.setPriceI18n("Price");
		foodOrderI18n.setRoomI18n("Room");
		foodOrderI18n.setWaiterNameI18n("Waiter");
		foodOrderI18n.setGetAllTitleI18n("Food Orders");
		foodOrderI18n.setGetTitleI18n("Food Order");
		foodOrderI18n.setEditTitleI18n("Edit");
		foodOrderI18n.setCreateTitleI18n("Create");
		foodI18nRepository.save(foodOrderI18n);
		
		
		foodOrderI18n2.setCheckinI18n("Check-In");
		foodOrderI18n2.setFoodItemI18n("Lebensmittel");
		foodOrderI18n2.setLangI18n("DE");
		foodOrderI18n2.setNoofPersonsI18n("Personen");
		foodOrderI18n2.setPriceI18n("Preis");
		foodOrderI18n2.setRoomI18n("Zimmer");
		foodOrderI18n2.setWaiterNameI18n("Kellner");
		foodOrderI18n2.setGetAllTitleI18n("Essensbestellungen");
		foodOrderI18n2.setGetTitleI18n("Essensbestellung");
		foodOrderI18n2.setEditTitleI18n("Bearbeiten");
		foodOrderI18n2.setCreateTitleI18n("Erstellen");
		foodI18nRepository.save(foodOrderI18n2);

	}

}
