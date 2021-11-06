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
		
		customerI18n.setAddressI18n("");
		customerI18n.setCityI18n("");
		customerI18n.setMobileI18n("");
		customerI18n.setFullnameI18n("");
		customerI18n.setEmailI18n("");
		customerI18n.setUserI18n("");
		customerI18n.setLangI18n("EN");
		customerI18n.setGetTitleI18n("City");
		customerI18n.setCreateTitleI18n("Create new City");
		customerI18n.setEditTitleI18n("Edit City");
		customerI18n.setGetAllTitleI18n("Cities");
		customerI18nRepository.save(customerI18n);
		
		customerI18n2.setAddressI18n("");
		customerI18n2.setCityI18n("");
		customerI18n2.setMobileI18n("");
		customerI18n2.setFullnameI18n("");
		customerI18n2.setEmailI18n("");
		customerI18n2.setUserI18n("");
		customerI18n2.setLangI18n("EN");
		customerI18n2.setGetTitleI18n("City");
		customerI18n2.setCreateTitleI18n("Create new City");
		customerI18n2.setEditTitleI18n("Edit City");
		customerI18n2.setGetAllTitleI18n("Cities");
		customerI18nRepository.save(customerI18n2);
	}

}
