package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.BlogCategoryI18nRepository;
import com.dev.delta.services.BlogCategoryService;

@Service
public class BlogCategoryDTO implements DTO {

	@Autowired
	BlogCategoryService blogCategoryService;
	
	@Autowired
	BlogCategoryI18nRepository  blogCategoryI18nRepository;
	
	@Override
	public void populate() {
		
		blogCategory.setName("Travel");
		blogCategory1.setName("Restaurant");
		blogCategory2.setName("Inspiration");
		blogCategory3.setName("Product");
		blogCategoryService.save(blogCategory);
		blogCategoryService.save(blogCategory1);
		blogCategoryService.save(blogCategory2);
		blogCategoryService.save(blogCategory3);
		
		blogCategoryI18n.setLangI18n("EN");
		blogCategoryI18n.setNameI18n("Category Name");
		blogCategoryI18n.setGetTitleI18n("Blog");
		blogCategoryI18n.setCreateTitleI18n("Create");
		blogCategoryI18n.setEditTitleI18n("Edit");
		blogCategoryI18n.setGetAllTitleI18n("Blog categories");
		blogCategoryI18nRepository.save(blogCategoryI18n);
		
		blogCategoryI18n2.setLangI18n("DE");
		blogCategoryI18n2.setNameI18n("Kategoriename");
		blogCategoryI18n2.setGetTitleI18n("Blog");
		blogCategoryI18n2.setCreateTitleI18n("Erstellen");
		blogCategoryI18n2.setEditTitleI18n("Bearbeiten");
		blogCategoryI18n2.setGetAllTitleI18n("Blogkategorien");
		blogCategoryI18nRepository.save(blogCategoryI18n2);

	}

}
