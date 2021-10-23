package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.services.GalleryService;

@Service
public class GalleryDTO implements DTO {

	@Autowired
	GalleryService galleryService;
	
	
	
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

	}

}
