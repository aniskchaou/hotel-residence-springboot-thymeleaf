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
		
		  expenseCategoryI18n.setCategoryNameI18n("Category");
		  expenseCategoryI18n.setLangI18n("EN");
		  expenseCategoryI18n.setGetTitleI18n("Expense Category");
		  expenseCategoryI18n.setCreateTitleI18n("Create");
		  expenseCategoryI18n.setEditTitleI18n("Edit");
		  expenseCategoryI18n.setGetAllTitleI18n("Expense Categories");
	      expenseCategoryI18nRepository.save(expenseCategoryI18n);
	      
	      expenseCategoryI18n2.setCategoryNameI18n("Kategorie");
		  expenseCategoryI18n2.setLangI18n("DE");
		  expenseCategoryI18n2.setGetTitleI18n("Ausgabenkategorie");
		  expenseCategoryI18n2.setCreateTitleI18n("Erstellen");
		  expenseCategoryI18n2.setEditTitleI18n("Bearbeiten");
		  expenseCategoryI18n2.setGetAllTitleI18n("Ausgabenkategorie");
	      expenseCategoryI18nRepository.save(expenseCategoryI18n2);
	}

}
