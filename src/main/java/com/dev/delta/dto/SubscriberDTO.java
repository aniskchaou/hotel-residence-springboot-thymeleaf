package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.SubscriberI18nRepository;
@Service
public class SubscriberDTO implements DTO {

	@Autowired
	SubscriberI18nRepository  subscriberI18nRepository;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		subscriberI18n.setEmailI18n("Email");
		subscriberI18n.setLangI18n("EN");
		subscriberI18n.setGetAllTitleI18n("Subscribers");
		subscriberI18nRepository.save(subscriberI18n);
		
		subscriberI18n2.setEmailI18n("Email");
		subscriberI18n2.setLangI18n("DE");
		subscriberI18n2.setGetAllTitleI18n("Abonnenten");
		subscriberI18nRepository.save(subscriberI18n2);
		
	}
}
