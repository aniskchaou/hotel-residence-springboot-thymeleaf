package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.CurrencyRepository;

@Service
public class CurrencyDTO implements DTO {

	@Autowired
	CurrencyRepository  currencyRepository;
	@Override
	public void populate() {
		currency.setName("EUR");
		currency.setSymbol("€");
		currencyRepository.save(currency);

	}

}
