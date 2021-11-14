package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.email.EmailSettingRepository;
import com.dev.delta.i18n.repositories.EmailI18nRepository;

@Service
public class EmailDTO implements DTO {

	@Autowired
	EmailSettingRepository  emailSettingRepository;
	
	@Autowired
	EmailI18nRepository   emailI18nRepository;
	
	@Override
	public void populate() {
		emailSetting.setAuth("true");
		emailSetting.setEnableTLS("true");
		emailSetting.setHost("smtp.gmail.com");
		emailSetting.setEmail("587");
		emailSetting.setPort("");
		emailSetting.setPassword("");
		
		emailSettingRepository.save(emailSetting);
		
		emailI18n.setAuthI18n("Auth");
		emailI18n.setEnableTLS("Enable TLS");
		emailI18n.setHost("Host Name");
		emailI18n.setEmailI18n("Email");
		emailI18n.setPort("Port Number");
		emailI18n.setPasswordI18n("Password");
		emailI18n.setGetAllTitleI18n("Email Settings");
		emailI18n.setCreateTitleI18n("Create new City");
		emailI18n.setEditTitleI18n("Edit email Settings");
		emailI18n.setGetTitleI18n("Email Setting");
		emailI18n.setLangI18n("EN");
		emailI18nRepository.save(emailI18n);
		
		emailI18n2.setAuthI18n("Auth");
		emailI18n2.setEnableTLS(" TLS");
		emailI18n2.setHost("Gastgebername");
		emailI18n2.setEmailI18n("Email");
		emailI18n2.setPort("Port-Nummer");
		emailI18n2.setPasswordI18n("Passwort");
		emailI18n2.setGetAllTitleI18n("Email Einstellungen");
		emailI18n2.setCreateTitleI18n("Erstellen");
		emailI18n2.setEditTitleI18n("Bearbeiten");
		emailI18n2.setGetTitleI18n("Email Einstellungen");
		emailI18n2.setLangI18n("DE");
		emailI18nRepository.save(emailI18n2);
		
	}

}
