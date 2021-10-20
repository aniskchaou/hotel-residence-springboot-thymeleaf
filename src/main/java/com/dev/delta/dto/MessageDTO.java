package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MessageRepository;

@Service
public class MessageDTO  implements DTO{

	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public void populate() {
		message.setEmail("contact@gmail.com");
		message.setMsg("");
		message.setName("Contact");
		message.setSubject("");
		messageRepository.save(message);
		
	}

}
