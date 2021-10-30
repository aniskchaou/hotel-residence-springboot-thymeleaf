package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.WebsiteMenuI18nRepository;

@Service
public class WebsiteDTO implements DTO {

	@Autowired
	WebsiteMenuI18nRepository websiteMenuI18nRepository;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
         websiteMenuI18n.setAboutItemI18n("About");
         websiteMenuI18n.setBlogItemI18n("Blog");
         websiteMenuI18n.setContactI18n("Contact");
         websiteMenuI18n.setHomeItemI18n("Home");
         websiteMenuI18n.setSignInI18n("Sign In");
         websiteMenuI18n.setRoomItemI18n("Rooms");
         websiteMenuI18n.setLang("EN");
         
         websiteMenu2I18n.setAboutItemI18n("حول");
         websiteMenu2I18n.setBlogItemI18n("مقالات");
         websiteMenu2I18n.setContactI18n("اتصال");
         websiteMenu2I18n.setRoomItemI18n("غرف");
         websiteMenu2I18n.setHomeItemI18n("الصفحة الرئيسية");
         websiteMenu2I18n.setSignInI18n("تسجيل الدخول");
         websiteMenu2I18n.setLang("AR");
		websiteMenuI18nRepository.save(websiteMenuI18n);
		websiteMenuI18nRepository.save(websiteMenu2I18n);
	}

}
