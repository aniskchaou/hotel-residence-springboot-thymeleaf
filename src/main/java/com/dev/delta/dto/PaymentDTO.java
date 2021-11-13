package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.PaymentI18nRepository;

@Service
public class PaymentDTO implements DTO{

	@Autowired
	PaymentI18nRepository  paymentI18nRepository;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		
		paymentI18n.setAmountI18n("Amount");
		paymentI18n.setCreateTitleI18n("Create");
		paymentI18n.setDateI18n("Date");
		paymentI18n.setEditTitleI18n("Edit");
		paymentI18n.setGetAllTitleI18n("Payments");
		paymentI18n.setGetTitleI18n("Payment");
		paymentI18n.setInvoiceNumberI18n("Invoice Number");
		paymentI18n.setLangI18n("EN");
		paymentI18n.setOrderNumberI18n("Order number");
		paymentI18n.setPaymentMethodI18n("Payment Method");
		paymentI18nRepository.save(paymentI18n);
		
		
		paymentI18n2.setAmountI18n("Betragen");
		paymentI18n2.setCreateTitleI18n("Erstellen");
		paymentI18n2.setDateI18n("Datum");
		paymentI18n2.setEditTitleI18n("Bearbeiten");
		paymentI18n2.setGetAllTitleI18n("Zahlungen");
		paymentI18n2.setGetTitleI18n("Zahlung");
		paymentI18n2.setInvoiceNumberI18n("Rechnungsnummer");
		paymentI18n2.setLangI18n("DE");
		paymentI18n2.setOrderNumberI18n("Bestellnummer");
		paymentI18n2.setPaymentMethodI18n("Zahlungsmethode");
		paymentI18nRepository.save(paymentI18n2);
	}

}
