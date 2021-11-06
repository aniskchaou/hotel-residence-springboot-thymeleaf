package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.UIHeaderI18nRepository;

@Service
public class HeaderDTO implements DTO {

	@Autowired
	UIHeaderI18nRepository   headerI18nRepository;
	
	
	@Override
	public void populate() {
		
		headerI18n.setBodymessage(" has sent an order from room number");
		headerI18n.setMessageone("You have ");
		headerI18n.setMessagetwoextrabed(" new extra bed orders");
		headerI18n.setMessagetwofood(" new food orders");
		headerI18n.setMessagetwohousekeeping(" new house keeping orders");
		headerI18n.setMessagetwolaundry(" new laundry orders");
		headerI18n.setMessagetwomessage(" new messages");
		headerI18n.setMessagetwonotification(" new notifications");
		headerI18n.setViewallbutton("view all");
		headerI18n.setLang("EN");
		
		
		headerI18n2.setBodymessage("hat eine Bestellung von Zimmernummer gesendet ");
		headerI18n2.setMessageone("Sie haben ");
		headerI18n2.setMessagetwoextrabed(" neue Zustellbettbestellungen");
		headerI18n2.setMessagetwofood(" neue Essensbestellungen");
		headerI18n2.setMessagetwohousekeeping(" neue Haushaltsordnungen");
		headerI18n2.setMessagetwolaundry(" neue wäschereibestellungen");
		headerI18n2.setMessagetwomessage(" neue Nachrichten");
		headerI18n2.setMessagetwonotification(" neue Benachrichtigungen");
		headerI18n2.setViewallbutton("alle anzeigen");
		headerI18n2.setLang("DE");
		
		headerI18nRepository.save(headerI18n);
		headerI18nRepository.save(headerI18n2);
		
		
		
	}

}
