package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.email.EmailSettingRepository;

@Service
public class EmailDTO implements DTO {

	@Autowired
	EmailSettingRepository  emailSettingRepository;
	
	@Override
	public void populate() {
		emailSetting.setAuth("true");
		emailSetting.setEnableTLS("true");
		emailSetting.setHost("smtp.gmail.com");
		emailSetting.setEmail("587");
		emailSetting.setPort("kchaouanis27@gmail.com");
		emailSetting.setPassword("20486902ANis@");
		emailSettingRepository.save(emailSetting);
	}

}
