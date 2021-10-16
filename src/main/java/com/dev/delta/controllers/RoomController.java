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

import com.dev.delta.entities.Room;
import com.dev.delta.services.RoomService;

@Controller
public class RoomController {
	/**
	 * roomService
	 */
	@Autowired
	private RoomService roomService;

	@GetMapping("/add-room")
	public String getaddRoom(Model model) {
		return "room/add";
	}

	/**
	 * getRooms
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/rooms")
	public String getRooms(Model model) {
		List<Room> rooms = roomService.getRooms();
	
		model.addAttribute("items", rooms);
	

		return "room/rooms";
	}

	/**
	 * addRoom
	 * 
	 * @param room
	 * @return
	 */
	@PostMapping("/addroom")

	public String addRoom(Room room) {
		roomService.save(room);
		return "redirect:/rooms";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/room/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Room room = roomService.findById(id).get();
		model.addAttribute("room", room);
		return "editActivities";
	}

	/**
	 * updateRoom
	 * 
	 * @param id
	 * @param room
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateroom/{id}")
	public String updateRoom(@PathVariable("id") long id, @Validated Room room, BindingResult result, Model model) {

		roomService.save(room);
		return "redirect:/rooms";
	}

	/**
	 * deleteRoom
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteroom/{id}")
	@Transactional
	public String deleteRoom(@PathVariable("id") Long id) {
		roomService.delete(id);
		return "redirect:/rooms";
	}
}
