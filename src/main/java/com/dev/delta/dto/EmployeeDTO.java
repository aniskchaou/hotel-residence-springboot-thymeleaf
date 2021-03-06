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
		 employeeI18n.setGetTitleI18n("Employee");
		 employeeI18n.setCreateTitleI18n("Create");
		 employeeI18n.setEditTitleI18n("Edit");
		 employeeI18n.setGetAllTitleI18n("Employees");
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
		 
		 
		 employeeI18n3.setLangI18n ("AR") ;
		 employeeI18n3.setGetTitleI18n ("??????????????") ;
		 employeeI18n3.setCreateTitleI18n ("??????????") ;
		 employeeI18n3.setEditTitleI18n ("??????????") ;
		 employeeI18n3.setGetAllTitleI18n ("??????????") ;
		 employeeI18n3.setAddressI18n ("??????????????") ;
		 employeeI18n3.setCityI18n ("??????????????") ;
		 employeeI18n3.setCountryI18n ("??????????") ;
		 employeeI18n3.setDateofbirthI18n ("?????????? ??????????????") ;
		 employeeI18n3.setDateOfJoiningI18n ("?????????? ????????????????") ;
		 employeeI18n3.setDesignationI18n ("??????????????") ;
		 employeeI18n3.setEmailI18n ("???????????? ????????????????????") ;
		 employeeI18n3.setFirstnameI18n ("Firstname") ;
		 employeeI18n3.setGenderI18n ("??????????") ;
		 employeeI18n3.setIDNumberI18n ("ID") ;
		 employeeI18n3.setPhoneI18n ("????????????") ;
		 employeeI18n3.setRemarkI18n ("????????????") ;
		 employeeI18n3.setSalaryI18n ("????????????") ;
		 employeeI18n3.setShiftI18n ("Shift") ;
		 employeeI18nRepository.save (employeeI18n3) ;
		 
		 employeeI18n4.setLangI18n("FR");
		 employeeI18n4.setGetTitleI18n("Ville");
		 employeeI18n4.setCreateTitleI18n("Cr??er");
		 employeeI18n4.setEditTitleI18n("Modifier");
		 employeeI18n4.setGetAllTitleI18n("Villes");
		 employeeI18n4.setAddressI18n("Adresse");
		 employeeI18n.setCityI18n("Ville");
		 employeeI18n4.setCountryI18n("Pays");
		 employeeI18n4.setDateofbirthI18n("Date de naissance");
		 employeeI18n4.setDateOfJoiningI18n("Date d'adh??sion");
		 employeeI18n4.setDesignationI18n("D??signation");
		 employeeI18n4.setEmailI18n("E-mail");
		 employeeI18n4.setFirstnameI18n("Pr??nom");
		 employeeI18n4.setGenderI18n("Sexe");
		 employeeI18n4.setIDNumberI18n("ID");
		 employeeI18n4.setPhoneI18n("T??l??phone");
		 employeeI18n4.setRemarkI18n("Remarque");
		 employeeI18n4.setSalaryI18n("Salaire");
		 employeeI18n4.setShiftI18n("Shift");
		 employeeI18nRepository.save(employeeI18n4);
		 
		 employeeI18n5.setLangI18n ("ES");
		 employeeI18n5.setGetTitleI18n ("Ciudad");
		 employeeI18n5.setCreateTitleI18n ("Crear");
		 employeeI18n5.setEditTitleI18n ("Editar");
		 employeeI18n5.setGetAllTitleI18n ("Ciudades");
		 employeeI18n5.setAddressI18n ("Direcci??n");
		 employeeI18n5.setCityI18n ("Ciudad");
		 employeeI18n5.setCountryI18n ("Pa??s");
		 employeeI18n5.setDateofbirthI18n ("Fecha de nacimiento");
		 employeeI18n5.setDateOfJoiningI18n ("Fecha de incorporaci??n");
		 employeeI18n5.setDesignationI18n ("Designaci??n");
		 employeeI18n5.setEmailI18n ("Correo electr??nico");
		 employeeI18n5.setFirstnameI18n ("Nombre");
		 employeeI18n5.setGenderI18n ("G??nero");
		 employeeI18n5.setIDNumberI18n ("ID");
		 employeeI18n5.setPhoneI18n ("Tel??fono");
		 employeeI18n5.setRemarkI18n ("Observaci??n");
		 employeeI18n5.setSalaryI18n ("Salario");
		 employeeI18n5.setShiftI18n ("Cambio");
		 employeeI18nRepository.save (employeeI18n5);
		 
		 
		 
		
	}

	
	
}
