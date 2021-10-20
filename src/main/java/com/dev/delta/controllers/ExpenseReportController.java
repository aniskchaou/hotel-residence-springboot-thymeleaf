package com.dev.delta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenseReportController {

	@GetMapping("/expensereport")
	public String getCitys(Model model) {
		
		return "city/cities";
	}
}
