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

		expenseI18n.setNameI18n("Name");
		expenseI18n.setRemarkI18n("Remark");
		expenseI18n.setDateI18n("Date");
		expenseI18n.setCategoryI18n("Category");
	    expenseI18n.setAmountI18n("Amount");
		expenseI18n.setGetTitleI18n("Expense");
		expenseI18n.setCreateTitleI18n("Create");
		expenseI18n.setEditTitleI18n("Edit");
		expenseI18n.setGetAllTitleI18n("Expenses");
		expenseI18n.setLangI18n("EN");
		expenseI18nRepository.save(expenseI18n);

		expenseI18n2.setNameI18n("Name");
		expenseI18n2.setRemarkI18n("Anmerkung");
		expenseI18n2.setDateI18n("Datum");
		expenseI18n2.setCategoryI18n("Kategorie");
		expenseI18n2.setAmountI18n("Betragen");
		expenseI18n2.setGetTitleI18n("Ausgaben");
		expenseI18n2.setCreateTitleI18n("Erstellen");
		expenseI18n2.setEditTitleI18n("Bearbeiten");
		expenseI18n2.setGetAllTitleI18n("Ausgaben");
		expenseI18n2.setLangI18n("DE");
		expenseI18nRepository.save(expenseI18n2);

	}

}
