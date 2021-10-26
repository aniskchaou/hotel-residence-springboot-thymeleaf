package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Expense;
import com.dev.delta.services.ExpenseCategoryService;
import com.dev.delta.services.ExpenseService;

@Controller
public class ExpenseController {
	/**
	 * expenseService
	 */
	@Autowired
	private ExpenseService expenseService;

	@Autowired
	private ExpenseCategoryService expenseCategoryService;
	@GetMapping("/add-expense")
	public String getaddExpense(Model model) {
		model.addAttribute("categories",expenseCategoryService.getExpenseCategorys());
		return "expense/add";
	}

	/**
	 * getExpenses
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/expenses")
	public String getExpenses(Model model) {
		List<Expense> expenses = expenseService.getExpenses();
		
		model.addAttribute("items", expenses);
		
		return "expense/expenses";
	}

	/**
	 * addExpense
	 * 
	 * @param expense
	 * @return
	 */
	@PostMapping("/addexpense")

	public String addExpense(Expense expense) {
		expenseService.save(expense);
		return "redirect:/expenses";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/editexpense/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Expense expense = expenseService.findById(id).get();
		model.addAttribute("item", expense);
		return "expense/edit";
	}

	/**
	 * updateExpense
	 * 
	 * @param id
	 * @param expense
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateexpense/{id}")
	public String updateExpense(@PathVariable("id") long id, @Validated Expense expense, BindingResult result, Model model) {

		expenseService.save(expense);
		return "redirect:/expenses";
	}

	/**
	 * deleteExpense
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteexpense/{id}")
	@Transactional
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseService.delete(id);
		return "redirect:/expenses";
	}
}
