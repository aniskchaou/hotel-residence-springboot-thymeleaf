package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.i18n.repositories.EmployeeI18nRepository;
import com.dev.delta.services.EmployeeService;

@Service
public class EmployeeDTO implements DTO{

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	EmployeeI18nRepository   employeeI18nRepository;
	
	@Override
	public void populate() {
	 
		//employeeService.save(null);
		
		
		 employeeI18n.setLangI18n("EN");
		 employeeI18n.setGetTitleI18n("City");
		 employeeI18n.setCreateTitleI18n("Create new City");
		 employeeI18n.setEditTitleI18n("Edit City");
		 employeeI18n.setGetAllTitleI18n("Cities");
		 employeeI18nRepository.save(employeeI18n);
		 
		 employeeI18n2.setLangI18n("DE");
		 employeeI18n2.setGetTitleI18n("City");
		 employeeI18n2.setCreateTitleI18n("Create new City");
		 employeeI18n2.setEditTitleI18n("Edit City");
		 employeeI18n2.setGetAllTitleI18n("Cities");
		 employeeI18nRepository.save(employeeI18n2);
		
	}

	
	
}
