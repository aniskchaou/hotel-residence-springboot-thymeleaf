package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.MessageI18nRepository;
import com.dev.delta.repositories.MessageRepository;

@Service
public class MessageDTO implements DTO {

	@Autowired
	MessageRepository messageRepository;

	@Autowired
	MessageI18nRepository messageI18nRepository;

	@Override
	public void populate() {
		message.setEmail("contact@gmail.com");
		message.setMsg("");
		message.setName("Contact");
		message.setSubject("");
		messageRepository.save(message);

		messageI18n.setEmailI18n("contact@gmail.com");
		messageI18n.setMsgI18n("");
		messageI18n.setNameI18n("Contact");
		messageI18n.setSubjectI18n("");
		messageI18n.setGetTitleI18n("City");
		messageI18n.setCreateTitleI18n("Create new City");
		messageI18n.setEditTitleI18n("Edit City");
		messageI18n.setGetAllTitleI18n("Cities");
		messageI18n.setLangI18n("EN");
		messageI18nRepository.save(messageI18n);

		messageI18n2.setEmailI18n("Email");
		messageI18n2.setMsgI18n("Nachricht");
		messageI18n2.setNameI18n("Name");
		messageI18n2.setSubjectI18n("Thema");
		messageI18n2.setGetTitleI18n("Nachricht");
		messageI18n2.setCreateTitleI18n("Erstellen");
		messageI18n2.setEditTitleI18n("Bearbeiten");
		messageI18n2.setGetAllTitleI18n("Nachrichten");
		messageI18n2.setLangI18n("DE");
		messageI18nRepository.save(messageI18n2);

	}

}
