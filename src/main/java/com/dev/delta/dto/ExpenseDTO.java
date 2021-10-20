package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.ExpenseService;

@Service
public class ExpenseDTO implements DTO{

	@Autowired
	ExpenseService expenseService;
	
	@Override
	public void populate() {
		expense.setName("Buy new Beds");
		expense.setRemark("  ");
		expense.setDate(new Date().toString());
		expense.setCategory(expenseCategory);
		expense.setAmount("1000");
		
		expenseService.save(expense);
		
	}

}
