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

import com.dev.delta.entities.PaymentMethod;
import com.dev.delta.services.PaymentMethodService;

@Controller
public class PaymentMethodController {
	/**
	 * paymentMethodService
	 */
	@Autowired
	private PaymentMethodService paymentMethodService;

	
	/**
	 * getPaymentMethods
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/paymentmethod")
	public String getPaymentMethods(Model model) {
		List<PaymentMethod> paymentMethods = paymentMethodService.getPaymentMethods();
		model.addAttribute("cities", paymentMethods);
		
		return "paymentMethod/cities";
	}

	/**
	 * addPaymentMethod
	 * 
	 * @param paymentMethod
	 * @return
	 */
	@PostMapping("/addpaymentMethod")

	public String addPaymentMethod(PaymentMethod paymentMethod) {
		paymentMethodService.save(paymentMethod);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/paymentMethod/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		PaymentMethod paymentMethod = paymentMethodService.findById(id).get();
		model.addAttribute("paymentMethod", paymentMethod);
		return "editActivities";
	}

	/**
	 * updatePaymentMethod
	 * 
	 * @param id
	 * @param paymentMethod
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepaymentMethod/{id}")
	public String updatePaymentMethod(@PathVariable("id") long id, @Validated PaymentMethod paymentMethod, BindingResult result, Model model) {

		paymentMethodService.save(paymentMethod);
		return "redirect:/cities";
	}

	/**
	 * deletePaymentMethod
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepaymentMethod/{id}")
	@Transactional
	public String deletePaymentMethod(@PathVariable("id") Long id) {
		paymentMethodService.delete(id);
		return "redirect:/cities";
	}
}
