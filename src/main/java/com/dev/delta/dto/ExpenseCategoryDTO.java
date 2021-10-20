package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ExpenseCategoryRepository;

@Service
public class ExpenseCategoryDTO implements DTO{

	@Autowired
	ExpenseCategoryRepository expenseCategoryRepository;
	
	@Override
	public void populate() {
		expenseCategory.setCategoryName("Fourniture");
		expenseCategory2.setCategoryName("Repair");
		expenseCategoryRepository.save(expenseCategory);
		expenseCategoryRepository.save(expenseCategory2);
	}

}
