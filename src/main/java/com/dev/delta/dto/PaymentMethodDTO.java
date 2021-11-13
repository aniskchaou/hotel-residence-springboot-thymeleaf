package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.PaymentMethodI18nRepository;

@Service
public class PaymentMethodDTO implements DTO {

	@Autowired
	PaymentMethodI18nRepository  paymentMethodI18nRepository ;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		paymentMethodI18n.setCreateTitleI18n("Erstellen");
		paymentMethodI18n.setEditTitleI18n("Bearbeiten");
		paymentMethodI18n.setGetAllTitleI18n("Zahlungsmethoden");
		paymentMethodI18n.setGetTitleI18n("Zahlungsmethoden");
		paymentMethodI18n.setLangI18n("DE");
		paymentMethodI18n.setNameI18n("Name");
		paymentMethodI18nRepository.save(paymentMethodI18n);
		
		
		paymentMethodI18n2.setCreateTitleI18n("Create");
		paymentMethodI18n2.setEditTitleI18n("Edit");
		paymentMethodI18n2.setGetAllTitleI18n("Payment Methods");
		paymentMethodI18n2.setGetTitleI18n("Payment Method");
		paymentMethodI18n2.setLangI18n("EN");
		paymentMethodI18n2.setNameI18n("Name");
		paymentMethodI18nRepository.save(paymentMethodI18n2);
	}

}
