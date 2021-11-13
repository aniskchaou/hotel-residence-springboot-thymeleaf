package com.dev.delta.dto;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.HouseKeepingOrderI18nRepository;

@Service
public class HouseKeepingOrderDTO implements DTO {

	@Autowired
	HouseKeepingOrderI18nRepository   houseKeepingOrderI18nRepository;
	
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		houseKeepingOrderI18n.setAssignedToI18n("Assigned");
		houseKeepingOrderI18n.setHousekeepingItemI18n("Item");
		houseKeepingOrderI18n.setHousekeepingStatusI18n("Status");
		houseKeepingOrderI18n.setRemarkI18n("Remark");
		houseKeepingOrderI18n.setRoomI18n("Room");
		houseKeepingOrderI18n.setLangI18n("EN");
		houseKeepingOrderI18n.setCreateTitleI18n("Create");
		houseKeepingOrderI18n.setEditTitleI18n("Edit");
		houseKeepingOrderI18n.setGetAllTitleI18n("HouseKeeping Orders");
		houseKeepingOrderI18n.setGetTitleI18n("HouseKeeping Order");
      houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n);
      
      houseKeepingOrderI18n2.setAssignedToI18n("Zugewiesen an");
		houseKeepingOrderI18n2.setHousekeepingItemI18n("Artikel");
		houseKeepingOrderI18n2.setHousekeepingStatusI18n("Status");
		houseKeepingOrderI18n2.setRemarkI18n("Bemerkung");
		houseKeepingOrderI18n2.setRoomI18n("Zimmer");
		houseKeepingOrderI18n2.setLangI18n("DE");
		houseKeepingOrderI18n2.setCreateTitleI18n("Erstellen");
		houseKeepingOrderI18n2.setEditTitleI18n("Bearbeiten");
		houseKeepingOrderI18n2.setGetAllTitleI18n("HouseKeeping Bestellungen");
		houseKeepingOrderI18n2.setGetTitleI18n("HouseKeeping Ordnung");
    houseKeepingOrderI18nRepository.save(houseKeepingOrderI18n2);
		
	}

}
