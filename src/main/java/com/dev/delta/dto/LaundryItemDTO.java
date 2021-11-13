package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.LaundryItemI18nRepository;
import com.dev.delta.repositories.LaundryItemRepository;

@Service
public class LaundryItemDTO implements DTO {

	@Autowired
	LaundryItemRepository   laundryItemRepository;
	
	@Autowired
	LaundryItemI18nRepository laundryItemI18nRepository  ;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
       laundryItem.setComment("czeze");
       laundryItem.setName("Tshirt");
       laundryItem.setQuantity("2");
       
       laundryItemI18n.setComment("Comment");
       laundryItemI18n.setCreateTitleI18n("Create");
       laundryItemI18n.setEditTitleI18n("Edit");
       laundryItemI18n.setGetAllTitleI18n("Laundry items");
       laundryItemI18n.setGetTitleI18n("Laundry item");
       laundryItemI18n.setLangI18n("EN");
       laundryItemI18n.setName("Name");
       laundryItemI18n.setQuantity("2");
       
       laundryItemI18n2.setComment("Kommentar");
       laundryItemI18n2.setCreateTitleI18n("Erstellen");
       laundryItemI18n2.setEditTitleI18n("Bearbeiten");
       laundryItemI18n2.setGetAllTitleI18n("Wäscheartikel");
       laundryItemI18n2.setGetTitleI18n("Wäscheartikel");
       laundryItemI18n2.setLangI18n("DE");
       laundryItemI18n2.setName("Name");
       laundryItemI18n2.setQuantity("2");
       
       laundryItemRepository.save(laundryItem);
       laundryItemI18nRepository.save(laundryItemI18n);
       laundryItemI18nRepository.save(laundryItemI18n2);
       
       
	}

}
