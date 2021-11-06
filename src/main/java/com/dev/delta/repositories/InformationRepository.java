package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.delta.entities.InformationHotel;


public interface InformationRepository extends JpaRepository<InformationHotel, Long> {
	
	 InformationHotel findByLangbackoffice(String langbackoffice);
   
}
