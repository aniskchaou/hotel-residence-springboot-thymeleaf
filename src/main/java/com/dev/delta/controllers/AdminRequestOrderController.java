package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dev.delta.entities.ExtraBedRequestOrder;
import com.dev.delta.entities.FoodRequestOrder;
import com.dev.delta.entities.HouseKeepingRequestOrder;
import com.dev.delta.entities.LaundryRequestOrder;
import com.dev.delta.i18n.entities.ExtraBedRequestI18n;
import com.dev.delta.i18n.entities.FoodRequestI18n;
import com.dev.delta.i18n.entities.HouseKeepingRequestI18n;
import com.dev.delta.i18n.entities.LaundryOrderI18n;
import com.dev.delta.i18n.entities.LaundryRequestI18n;
import com.dev.delta.i18n.repositories.ExtraBedRequestI18nRepository;
import com.dev.delta.i18n.repositories.FoodRequestI18nRepository;
import com.dev.delta.i18n.repositories.HouseKeepingI18nRepository;
import com.dev.delta.i18n.repositories.LaundryRequestI18nRepository;
import com.dev.delta.services.ExtraBedRequestService;
import com.dev.delta.services.FoodRequestOrderService;
import com.dev.delta.services.HouseKeepingRequestOrderService;
import com.dev.delta.services.InformationService;
import com.dev.delta.services.LaundryRequestOrderService;
import com.dev.delta.util.UIMenuHeaderUtil;

@Controller
public class AdminRequestOrderController {

	@Autowired
	ExtraBedRequestService extraBedRequestService;
	
	@Autowired
	HouseKeepingRequestOrderService  houseKeepingRequestOrderService;
	
	@Autowired
	FoodRequestOrderService  foodRequestOrderService;
	
	@Autowired
	LaundryRequestOrderService  laundryRequestOrderService;
	
	 @Autowired
	 InformationService  informationService;
	 
	 @Autowired
	 UIMenuHeaderUtil   menuHeaderUtil;
	 
	 @Autowired
	 LaundryRequestI18nRepository   laundryRequestI18nRepository;
	 
	 @Autowired
	 ExtraBedRequestI18nRepository  extraBedRequestI18nRepository;
	 
	 @Autowired
	 FoodRequestI18nRepository   foodRequestI18nRepository;
	 
	 @Autowired
	 HouseKeepingI18nRepository    houseKeepingI18nRepository;
	
	@GetMapping("/extrabedadminrequest")
	public String getextrabedsAdminRequest(Model model) {
		List<ExtraBedRequestOrder> items = extraBedRequestService.getExtraBedRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		ExtraBedRequestI18n houseI18n = extraBedRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "adminrequest/extrabedrequest";
	}
	

	@GetMapping("/laundryadminrequest")
	public String getLaundryAdminRequest(Model model) {
		List<LaundryRequestOrder> items = laundryRequestOrderService.getLaundriesRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		LaundryRequestI18n houseI18n = laundryRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "adminrequest/laundryrequest";
	}
	
	
	@GetMapping("/housekeepingadminrequest")
	public String getHouseKeepingAdminRequest(Model model) {
		List<HouseKeepingRequestOrder> items = houseKeepingRequestOrderService.gethousekeepingRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		HouseKeepingRequestI18n houseI18n = houseKeepingI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "adminrequest/housekeepingrequest";
	}
	
	@GetMapping("/foodadminrequest")
	public String getFoodOrderAdminRequest(Model model) {
		List<FoodRequestOrder> items = foodRequestOrderService.getFoodRequest();
		model.addAttribute("items", items);
		String lang = informationService.getSeletedLang();
		FoodRequestI18n houseI18n = foodRequestI18nRepository.findByLangI18n(lang);
		model.addAttribute("itemI18n", houseI18n);
		menuHeaderUtil.getMenuHeader(model);
		return "adminrequest/foodrequest";
	}
	
	
	
	
}
