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
		 employeeI18n.setCreateTitleI18n("Create");
		 employeeI18n.setEditTitleI18n("Edit");
		 employeeI18n.setGetAllTitleI18n("Cities");
		 employeeI18n.setAddressI18n("Address");
		 employeeI18n.setCityI18n("City");
		 employeeI18n.setCountryI18n("Country");
		 employeeI18n.setDateofbirthI18n("Date of birth");
		 employeeI18n.setDateOfJoiningI18n("Date of joining");
		 employeeI18n.setDesignationI18n("Designation");
		 employeeI18n.setEmailI18n("Email");
		 employeeI18n.setFirstnameI18n("Firstname");
		 employeeI18n.setGenderI18n("Gender");
		 employeeI18n.setIDNumberI18n("ID");
		 employeeI18n.setPhoneI18n("Telephone");
		 employeeI18n.setRemarkI18n("Remark");
		 employeeI18n.setSalaryI18n("Salary");
		 employeeI18n.setShiftI18n("Shift");
		 employeeI18nRepository.save(employeeI18n);
		 
		 employeeI18n2.setLangI18n("DE");
		 employeeI18n2.setGetTitleI18n("Angestellter");
		 employeeI18n2.setCreateTitleI18n("Erstellen");
		 employeeI18n2.setEditTitleI18n("Bearbeiten");
		 employeeI18n2.setGetAllTitleI18n("Mitarbeiter");
		 employeeI18n2.setAddressI18n("Anschrift");
		 employeeI18n2.setCityI18n("Stadt");
		 employeeI18n2.setCountryI18n("Land");
		 employeeI18n2.setDateofbirthI18n("Geburtsdatum");
		 employeeI18n2.setDateOfJoiningI18n("Eintrittsdatum");
		 employeeI18n2.setDesignationI18n("Bezeichnung");
		 employeeI18n2.setEmailI18n("Email");
		 employeeI18n2.setFirstnameI18n("Vorname");
		 employeeI18n2.setGenderI18n("Geschlecht");
		 employeeI18n2.setIDNumberI18n("Ausweis");
		 employeeI18n2.setPhoneI18n("Telefon");
		 employeeI18n2.setRemarkI18n("Anmerkung");
		 employeeI18n2.setSalaryI18n("Gehalt");
		 employeeI18n2.setShiftI18n("Schicht");
		 employeeI18nRepository.save(employeeI18n2);
		
	}

	
	
}
