package com.dev.delta.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.ExpenseI18nRepository;
import com.dev.delta.services.ExpenseService;

@Service
public class ExpenseDTO implements DTO {

	@Autowired
	ExpenseService expenseService;

	@Autowired
	ExpenseI18nRepository expenseI18nRepository;

	@Override
	public void populate() {
		expense.setName("Buy new Beds");
		expense.setRemark("  ");
		expense.setDate(new Date().toString());
		expense.setCategory(expenseCategory);
		expense.setAmount("1000");

		expenseService.save(expense);

		expenseI18n.setNameI18n("Buy new Beds");
		expenseI18n.setRemarkI18n("  ");
		expenseI18n.setDateI18n("");
		expenseI18n.setCategoryI18n("");
		expenseI18n.setAmountI18n("1000");
		expenseI18n.setGetTitleI18n("City");
		expenseI18n.setCreateTitleI18n("Create new City");
		expenseI18n.setEditTitleI18n("Edit City");
		expenseI18n.setGetAllTitleI18n("Cities");
		expenseI18n.setLangI18n("EN");
		expenseI18nRepository.save(expenseI18n);

		expenseI18n2.setNameI18n("Buy new Beds");
		expenseI18n2.setRemarkI18n("  ");
		expenseI18n2.setDateI18n("");
		expenseI18n2.setCategoryI18n("");
		expenseI18n2.setAmountI18n("1000");
		expenseI18n2.setGetTitleI18n("City");
		expenseI18n2.setCreateTitleI18n("Create new City");
		expenseI18n2.setEditTitleI18n("Edit City");
		expenseI18n2.setGetAllTitleI18n("Cities");
		expenseI18n2.setLangI18n("DE");
		expenseI18nRepository.save(expenseI18n2);

	}

}
