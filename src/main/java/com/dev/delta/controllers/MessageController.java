package com.dev.delta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.delta.entities.Customer;
import com.dev.delta.entities.Message;
import com.dev.delta.services.MessageService;

@Controller
public class MessageController {

	@Autowired
	MessageService messageService;
	
	
	@GetMapping("/messagesadmin")
	public String getMessages(Model model) {
		List<Message> msgs = messageService.getMessages();
		model.addAttribute("items", msgs);
		
		return "message/messages";
	}
	
	@PostMapping("/addmessage")
	public String addMessage(Message message) {
		
		messageService.addMessage(message);
		return "redirect:/";
		
	}
	
	@RequestMapping("/message/{id}")
	public String findById(@PathVariable("id") Long id, Model model) {
		Message message = messageService.findById(id);
		model.addAttribute("item", message);
		return "message/view";
	}
}
