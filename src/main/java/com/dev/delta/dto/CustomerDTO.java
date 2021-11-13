package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CustomerI18nRepository;
import com.dev.delta.repositories.CustomerRepository;

@Service
public class CustomerDTO implements DTO{

	@Autowired
	CustomerRepository  customerRepository;
	
	@Autowired
	CustomerI18nRepository  customerI18nRepository;
	
	@Override
	public void populate() {
		customer.setAddress(faker.address().streetName());
		customer.setCity(city);
		customer.setMobile(faker.phoneNumber().cellPhone().toString());
		customer.setFullname(faker.name().fullName());
		customer.setEmail(faker.internet().emailAddress());
		customer.setUser(user);
		
		customerRepository.save(customer);	
		
		
		customer2.setAddress(faker.address().streetName());
		customer2.setCity(city);
		customer2.setMobile(faker.phoneNumber().cellPhone().toString());
		customer2.setFullname(faker.name().fullName());
		customer2.setEmail(faker.internet().emailAddress());
		customer2.setUser(user1);
		customerRepository.save(customer2);	
		
		customerI18n.setAddressI18n("Address");
		customerI18n.setCityI18n("City");
		customerI18n.setMobileI18n("Mobile");
		customerI18n.setFullnameI18n("Fullname");
		customerI18n.setEmailI18n("Email");
		customerI18n.setUserI18n("User");
		customerI18n.setLangI18n("EN");
		customerI18n.setGetTitleI18n("Customer");
		customerI18n.setCreateTitleI18n("Create");
		customerI18n.setEditTitleI18n("Edit");
		customerI18n.setGetAllTitleI18n("Customers");
		customerI18n.setAgeI18n("Age");
		customerI18n.setGenderI18n("Gender");
		customerI18n.setCountryI18n("Country");
		customerI18nRepository.save(customerI18n);
		
		customerI18n2.setAddressI18n("Anschrift");
		customerI18n2.setCityI18n("Stadt");
		customerI18n2.setMobileI18n("Handy");
		customerI18n2.setFullnameI18n("vollständiger Name");
		customerI18n2.setEmailI18n("Email");
		customerI18n2.setUserI18n("Benutzer");
		customerI18n2.setLangI18n("DE");
		customerI18n2.setGetTitleI18n("Kunde");
		customerI18n2.setCreateTitleI18n("Erstellen");
		customerI18n2.setEditTitleI18n("Bearbeiten");
		customerI18n2.setGetAllTitleI18n("Kunden");
		customerI18n2.setAgeI18n("Alter");
		customerI18n2.setGenderI18n("Geschlecht");
		customerI18n2.setCountryI18n("Land");
	   
		
		
		
		customerI18nRepository.save(customerI18n2);
	}

}
