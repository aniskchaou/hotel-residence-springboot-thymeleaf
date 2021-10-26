package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.delta.email.EmailSetting;
import com.dev.delta.email.EmailSettingRepository;
import com.dev.delta.entities.Currency;
import com.dev.delta.entities.InformationHotel;
import com.dev.delta.entities.User;
import com.dev.delta.repositories.CurrencyRepository;
import com.dev.delta.repositories.InformationRepository;
import com.dev.delta.repositories.UserRepository;

@Controller
public class SettingController {

	@Autowired
	InformationRepository informationRepository;
	
	@Autowired
	EmailSettingRepository  emailSettingRepository;
	
	@Autowired
	UserRepository  userRepository;
	
	@Autowired
	CurrencyRepository  currencyRepository;
	
	@GetMapping("/settings")
	public String getAmenitys(Model model) {
		List<InformationHotel> hotel = informationRepository.findAll();
		List<EmailSetting>  email=emailSettingRepository.findAll();
		List<Currency> currency=currencyRepository.findAll();
		List<User> user=userRepository.findAll();
		model.addAttribute("hotel", hotel.get(0));
		model.addAttribute("email", email.get(0));
		model.addAttribute("user", user.get(0));
		model.addAttribute("currency", currency.get(0));
		
		return "settings/settings";
	}
	
	@PostMapping("/updatehotelsetting/{id}")
	public String updateHotel(@PathVariable("id") long id, @Validated InformationHotel hotel, BindingResult result, Model model) {

		informationRepository.save(hotel);
		return "redirect:/settings";
	}
	
	
	@PostMapping("/updatecurrency/{id}")
	public String updateCurrecy(@PathVariable("id") long id, @Validated Currency currency, BindingResult result, Model model) {

		currencyRepository.save(currency);
		return "redirect:/settings";
	}
	
	
	@PostMapping("/updateemailsetting/{id}")
	public String updateUser(@PathVariable("id") long id, @Validated EmailSetting email, BindingResult result, Model model) {

		emailSettingRepository.save(email);
		return "redirect:/settings";
	}
	
	@PostMapping("/updateusersetting/{id}")
	public String updateRoom(@PathVariable("id") long id, @Validated User user, BindingResult result, Model model) {

		userRepository.save(user);
		return "redirect:/settings";
	}
}
