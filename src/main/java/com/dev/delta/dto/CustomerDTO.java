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
		
		

		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		//String city = faker.address().city();
		String country = faker.address().country();
		customer.setAddress(streetName);
		customer.setCity(city);
		customer.setMobile(faker.phoneNumber().cellPhone().toString());
		customer.setFullname(faker.name().fullName());
		customer.setEmail(faker.internet().emailAddress());
		customerRepository.save(customer);
		
		
	}

}
