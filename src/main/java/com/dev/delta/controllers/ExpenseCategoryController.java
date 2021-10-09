package com.dev.delta.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.ExpenseCategory;
import com.dev.delta.services.ExpenseCategoryService;



@Controller
public class ExpenseCategoryController {
	private ExpenseCategoryService expenseCategoryService;

	/**
	 * expenseCategoryService
	 */

	/**
	 * getExpenseCategorys
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/expensecategories")
	public String getExpenseCategorys(Model model) {
		List<ExpenseCategory> expenseCategorys = expenseCategoryService.getExpenseCategorys();
		model.addAttribute("cities", expenseCategorys);
	

		return "expenseCategory/cities";
	}

	/**
	 * addExpenseCategory
	 * 
	 * @param expenseCategory
	 * @return
	 */
	@PostMapping("/addexpenseCategory")

	public String addExpenseCategory(ExpenseCategory expenseCategory) {
		expenseCategoryService.save(expenseCategory);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/expenseCategory/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		ExpenseCategory expenseCategory = expenseCategoryService.findById(id).get();
		model.addAttribute("expenseCategory", expenseCategory);
		return "editActivities";
	}

	/**
	 * updateExpenseCategory
	 * 
	 * @param id
	 * @param expenseCategory
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateexpenseCategory/{id}")
	public String updateExpenseCategory(@PathVariable("id") long id, @Validated ExpenseCategory expenseCategory, BindingResult result, Model model) {

		expenseCategoryService.save(expenseCategory);
		return "redirect:/cities";
	}

	/**
	 * deleteExpenseCategory
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteexpenseCategory/{id}")
	@Transactional
	public String deleteExpenseCategory(@PathVariable("id") Long id) {
		expenseCategoryService.delete(id);
		return "redirect:/cities";
	}
	
}
