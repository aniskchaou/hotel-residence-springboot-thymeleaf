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

import com.dev.delta.entities.HouseKeepingItem;
import com.dev.delta.services.HouseKeepingItemService;
@Controller
public class HouseKeepingItemController {
	/**
	 * houseKeepingItemService
	 */
	@Autowired
	private HouseKeepingItemService houseKeepingItemService;


	/**
	 * getHouseKeepingItems
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/housekeepingitems")
	public String getHouseKeepingItems(Model model) {
		List<HouseKeepingItem> houseKeepingItems = houseKeepingItemService.getHouseKeepingItems();

		model.addAttribute("cities", houseKeepingItems);

		return "houseKeepingItem/cities";
	}

	/**
	 * addHouseKeepingItem
	 * 
	 * @param houseKeepingItem
	 * @return
	 */
	@PostMapping("/addhouseKeepingItem")

	public String addHouseKeepingItem(HouseKeepingItem houseKeepingItem) {
		houseKeepingItemService.save(houseKeepingItem);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/houseKeepingItem/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		HouseKeepingItem houseKeepingItem = houseKeepingItemService.findById(id).get();
		model.addAttribute("houseKeepingItem", houseKeepingItem);
		return "editActivities";
	}

	/**
	 * updateHouseKeepingItem
	 * 
	 * @param id
	 * @param houseKeepingItem
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatehouseKeepingItem/{id}")
	public String updateHouseKeepingItem(@PathVariable("id") long id, @Validated HouseKeepingItem houseKeepingItem, BindingResult result, Model model) {

		houseKeepingItemService.save(houseKeepingItem);
		return "redirect:/cities";
	}

	/**
	 * deleteHouseKeepingItem
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletehouseKeepingItem/{id}")
	@Transactional
	public String deleteHouseKeepingItem(@PathVariable("id") Long id) {
		houseKeepingItemService.delete(id);
		return "redirect:/cities";
	}
}
