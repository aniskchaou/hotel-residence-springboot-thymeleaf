package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.GalleryI18nRepository;
import com.dev.delta.services.GalleryService;

@Service
public class GalleryDTO implements DTO {

	@Autowired
	GalleryService galleryService;
	
	@Autowired
	GalleryI18nRepository   galleryI18nRepository;
	
	@Override
	public void populate() {

		gallery.setTitle("Hotel Residence");
		gallery.setSubTitle("Unlock to enjoy the view of Martine");
		
		gallery2.setTitle("Life is Beautiful");
		gallery2.setSubTitle("Unlock to enjoy the view of Martine");
		
		gallery3.setTitle("Hotel Residence");
		gallery3.setSubTitle("Unlock to enjoy the view of Martine");
		
		gallery4.setTitle("Life is Beautiful");
		gallery4.setSubTitle("Unlock to enjoy the view of Martine");
		
		galleryService.save(gallery);
		galleryService.save(gallery2);
		galleryService.save(gallery3);
		galleryService.save(gallery4);
		
		  galleryI18n.setTitleI18n("");
		  galleryI18n.setSubTitleI18n("");
		  galleryI18n.setGetTitleI18n("City");
		  galleryI18n.setCreateTitleI18n("Create new City");
		  galleryI18n.setEditTitleI18n("Edit City");
		  galleryI18n.setGetAllTitleI18n("Cities");
		  galleryI18n.setLangI18n("EN");
		  galleryI18nRepository.save(galleryI18n);
		  
		  galleryI18n2.setTitleI18n("");
		  galleryI18n2.setSubTitleI18n("");
		  galleryI18n2.setGetTitleI18n("City");
		  galleryI18n2.setCreateTitleI18n("Create new City");
		  galleryI18n2.setEditTitleI18n("Edit City");
		  galleryI18n2.setGetAllTitleI18n("Cities");
		  galleryI18n2.setLangI18n("DE");
		  galleryI18nRepository.save(galleryI18n2);

	}

}
