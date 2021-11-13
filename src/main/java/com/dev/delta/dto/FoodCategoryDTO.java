package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.FoodCategoryI18nRepository;
import com.dev.delta.services.FoodCategoryService;

@Service
public class FoodCategoryDTO implements DTO {

	@Autowired
	FoodCategoryService foodCategoryService;
	
	@Autowired
	FoodCategoryI18nRepository  foodCategoryI18nRepository;

	@Override
	public void populate() {

		foodCategory.setName("Beverages");
		foodCategory.setStatus("Active");

		foodCategory2.setName("Breakfast");
		foodCategory2.setStatus("Active");
		foodCategoryService.save(foodCategory);
		foodCategoryService.save(foodCategory2);
		
		foodCategoryI18n.setNameI18n("Name");
		foodCategoryI18n.setStatusI18n("Status");
		foodCategoryI18n.setGetTitleI18n("Food category");
		foodCategoryI18n.setCreateTitleI18n("Create");
		foodCategoryI18n.setEditTitleI18n("Edit");
		foodCategoryI18n.setGetAllTitleI18n("Food categories");
		foodCategoryI18n.setLangI18n("EN");
		foodCategoryI18nRepository.save(foodCategoryI18n);
		
		foodCategoryI18n2.setNameI18n("Name");
		foodCategoryI18n2.setStatusI18n("Status");
		foodCategoryI18n2.setGetTitleI18n("Lebensmittelkategorie");
		foodCategoryI18n2.setCreateTitleI18n("Erstellen");
		foodCategoryI18n2.setEditTitleI18n("Bearbeiten");
		foodCategoryI18n2.setGetAllTitleI18n("Lebensmittelkategorien");
		foodCategoryI18n2.setLangI18n("DE");
		foodCategoryI18nRepository.save(foodCategoryI18n2);
		

	}

}
