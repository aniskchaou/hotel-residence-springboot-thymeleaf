package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExpenseCategoryI18nRepository;
import com.dev.delta.repositories.ExpenseCategoryRepository;

@Service
public class ExpenseCategoryDTO implements DTO{

	@Autowired
	ExpenseCategoryRepository expenseCategoryRepository;
	
	@Autowired
	ExpenseCategoryI18nRepository  expenseCategoryI18nRepository;
	
	@Override
	public void populate() {
		expenseCategory.setCategoryName("Fourniture");
		expenseCategory2.setCategoryName("Repair");
		expenseCategoryRepository.save(expenseCategory);
		expenseCategoryRepository.save(expenseCategory2);
		
		  expenseCategoryI18n.setCategoryNameI18n("");
		  expenseCategoryI18n.setLangI18n("EN");
		  expenseCategoryI18n.setGetTitleI18n("City");
		  expenseCategoryI18n.setCreateTitleI18n("Create new City");
		  expenseCategoryI18n.setEditTitleI18n("Edit City");
		  expenseCategoryI18n.setGetAllTitleI18n("Cities");
	      expenseCategoryI18nRepository.save(expenseCategoryI18n);
	      
	      expenseCategoryI18n2.setCategoryNameI18n("");
		  expenseCategoryI18n2.setLangI18n("DE");
		  expenseCategoryI18n2.setGetTitleI18n("City");
		  expenseCategoryI18n2.setCreateTitleI18n("Create new City");
		  expenseCategoryI18n2.setEditTitleI18n("Edit City");
		  expenseCategoryI18n2.setGetAllTitleI18n("Cities");
	      expenseCategoryI18nRepository.save(expenseCategoryI18n2);
	}

}
