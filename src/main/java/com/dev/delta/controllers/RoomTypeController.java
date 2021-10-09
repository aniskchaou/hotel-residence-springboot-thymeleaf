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

import com.dev.delta.entities.RoomType;
import com.dev.delta.services.RoomTypeService;

@Controller
public class RoomTypeController {
	/**
	 * roomTypeService
	 */
	@Autowired
	private RoomTypeService roomTypeService;


	/**
	 * getRoomTypes
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/roomtypes")
	public String getRoomTypes(Model model) {
		List<RoomType> roomTypes = roomTypeService.getRoomTypes();
	
		model.addAttribute("cities", roomTypes);
	
		return "roomType/cities";
	}

	/**
	 * addRoomType
	 * 
	 * @param roomType
	 * @return
	 */
	@PostMapping("/addroomType")

	public String addRoomType(RoomType roomType) {
		roomTypeService.save(roomType);
		return "redirect:/cities";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/roomType/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		RoomType roomType = roomTypeService.findById(id).get();
		model.addAttribute("roomType", roomType);
		return "editActivities";
	}

	/**
	 * updateRoomType
	 * 
	 * @param id
	 * @param roomType
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateroomType/{id}")
	public String updateRoomType(@PathVariable("id") long id, @Validated RoomType roomType, BindingResult result, Model model) {

		roomTypeService.save(roomType);
		return "redirect:/cities";
	}

	/**
	 * deleteRoomType
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteroomType/{id}")
	@Transactional
	public String deleteRoomType(@PathVariable("id") Long id) {
		roomTypeService.delete(id);
		return "redirect:/cities";
	}
}
