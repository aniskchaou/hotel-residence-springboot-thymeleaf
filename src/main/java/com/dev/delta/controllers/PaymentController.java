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

import com.dev.delta.entities.Payment;
import com.dev.delta.services.PaymentMethodService;
import com.dev.delta.services.PaymentService;

@Controller
public class PaymentController {
	/**
	 * paymentService
	 */
	@Autowired
	private PaymentService paymentService;

	@Autowired
	private PaymentMethodService paymentMethodService;

	@GetMapping("/add-payment")
	public String getaddPayment(Model model) {
		model.addAttribute("paymentMethods", paymentMethodService.getPaymentMethods());
		return "payment/add";
	}

	/**
	 * getPayments
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/payments")
	public String getPayments(Model model) {
		List<Payment> payments = paymentService.getPayments();
		model.addAttribute("items", payments);

		return "payment/payments";
	}

	/**
	 * addPayment
	 * 
	 * @param payment
	 * @return
	 */
	@PostMapping("/addpayment")

	public String addPayment(Payment payment) {
		paymentService.save(payment);
		return "redirect:/payments";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/payment/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Payment payment = paymentService.findById(id).get();
		model.addAttribute("payment", payment);
		return "editActivities";
	}

	/**
	 * updatePayment
	 * 
	 * @param id
	 * @param payment
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatepayment/{id}")
	public String updatePayment(@PathVariable("id") long id, @Validated Payment payment, BindingResult result,
			Model model) {

		paymentService.save(payment);
		return "redirect:/payments";
	}

	/**
	 * deletePayment
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletepayment/{id}")
	@Transactional
	public String deletePayment(@PathVariable("id") Long id) {
		paymentService.delete(id);
		return "redirect:/payments";
	}
}
