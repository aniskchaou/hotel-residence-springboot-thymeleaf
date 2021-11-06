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
		food.setItemName("qdfsd");
		food.setStatus("Active");
		foodService.save(food);
		
		foodI18n.setCategoryI18n("Category");
		foodI18n.setPriceI18n("18");
		foodI18n.setItemNameI18n("qdfsd");
		foodI18n.setStatusI18n("Active");
		foodI18n.setLangI18n("EN");
		foodI18n.setGetTitleI18n("City");
		foodI18n.setCreateTitleI18n("Create new City");
		foodI18n.setEditTitleI18n("Edit City");
		foodI18n.setGetAllTitleI18n("Cities");
		
		
		foodI18n2.setCategoryI18n("Category");
		foodI18n2.setPriceI18n("18");
		foodI18n2.setItemNameI18n("qdfsd");
		foodI18n2.setStatusI18n("Active");
		foodI18n2.setLangI18n("DE");
		foodI18n2.setGetTitleI18n("City");
		foodI18n2.setCreateTitleI18n("Create new City");
		foodI18n2.setEditTitleI18n("Edit City");
		foodI18n2.setGetAllTitleI18n("Cities");
		
		foodI18nRepository.save(foodI18n);
		foodI18nRepository.save(foodI18n2);
		
	}

}
