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

import com.dev.delta.entities.Customer;
import com.dev.delta.services.CustomerService;

@Controller
public class CustomerController {
	/**
	 * customerService
	 */
	@Autowired
	private CustomerService customerService;

	
	/**
	 * getCustomers
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/customers")
	public String getCustomers(Model model) {
		List<Customer> customers = customerService.getCustomers();

		model.addAttribute("cities", customers);
	
		return "customer/cities";
	}

	/**
	 * addCustomer
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/addcustomer")

	public String addCustomer(Customer customer) {
		customerService.save(customer);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/customer/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Customer customer = customerService.findById(id).get();
		model.addAttribute("customer", customer);
		return "editActivities";
	}

	/**
	 * updateCustomer
	 * 
	 * @param id
	 * @param customer
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatecustomer/{id}")
	public String updateCustomer(@PathVariable("id") long id, @Validated Customer customer, BindingResult result, Model model) {

		customerService.save(customer);
		return "redirect:/cities";
	}

	/**
	 * deleteCustomer
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletecustomer/{id}")
	@Transactional
	public String deleteCustomer(@PathVariable("id") Long id) {
		customerService.delete(id);
		return "redirect:/cities";
	}
	
}
