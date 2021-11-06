package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.CurrencyI18nRepository;
import com.dev.delta.repositories.CurrencyRepository;

@Service
public class CurrencyDTO implements DTO {

	@Autowired
	CurrencyRepository  currencyRepository;
	
	@Autowired
	CurrencyI18nRepository  currencyI18nRepository;
	
	@Override
	public void populate() {
		currency.setName("EUR");
		currency.setSymbol("€");
		currencyRepository.save(currency);

		currencyI18n.setNameI18n("Name");
		currencyI18n.setSymbolI18n("Symbol");
		currencyI18n.setLangI18n("EN");
		currencyI18n.setGetAllTitleI18n("Currencies");
		currencyI18n.setCreateTitleI18n("Create new Currency");
		currencyI18n.setEditTitleI18n("Edit Currency");
		currencyI18n.setGetTitleI18n("City");
		currencyI18nRepository.save(currencyI18n);
		
		currencyI18n2.setNameI18n("Name");
		currencyI18n2.setSymbolI18n("Symbol");
		currencyI18n2.setLangI18n("DE");
		currencyI18n2.setGetAllTitleI18n("Cities");
		currencyI18n2.setCreateTitleI18n("Create new City");
		currencyI18n2.setEditTitleI18n("Edit City");
		currencyI18n2.setGetTitleI18n("City");
		currencyI18nRepository.save(currencyI18n2);
	}

}
