package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodI18nRepository;
import com.dev.delta.services.FoodService;

@Service
public class FoodDTO implements DTO {

	@Autowired
	FoodService foodService;
	
	@Autowired
	FoodI18nRepository  foodI18nRepository;
	
	@Override
	public void populate() {
	
		food.setCategory(foodCategory);
		food.setPrice("18");
		food.setItemName("Pizza");
		food.setStatus("Active");
		foodService.save(food);
		
		foodI18n.setCategoryI18n("Category");
		foodI18n.setPriceI18n("Price");
		foodI18n.setItemNameI18n("Item name");
		foodI18n.setStatusI18n("Status");
		foodI18n.setLangI18n("EN");
		foodI18n.setGetTitleI18n("Food");
		foodI18n.setCreateTitleI18n("Create");
		foodI18n.setEditTitleI18n("Edit");
		foodI18n.setGetAllTitleI18n("Foods");
		
		
		foodI18n2.setCategoryI18n("Kategorie");
		foodI18n2.setPriceI18n("Preis");
		foodI18n2.setItemNameI18n("Artikelname");
		foodI18n2.setStatusI18n("Status");
		foodI18n2.setLangI18n("DE");
		foodI18n2.setGetTitleI18n("Lebensmittel");
		foodI18n2.setCreateTitleI18n("Erstellen");
		foodI18n2.setEditTitleI18n("Bearbeiten");
		foodI18n2.setGetAllTitleI18n("Lebensmittel");
		
		foodI18nRepository.save(foodI18n);
		foodI18nRepository.save(foodI18n2);
		
	}

}
