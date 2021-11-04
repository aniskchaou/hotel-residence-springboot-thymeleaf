package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CustomerRepository;

@Service
public class CustomerDTO implements DTO{

	@Autowired
	CustomerRepository  customerRepository;
	
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
		
		customerRepository.save(customer2);	
	}

}
