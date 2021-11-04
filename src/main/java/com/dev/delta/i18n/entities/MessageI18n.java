package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MessageI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nameI18n;
	String emailI18n;
	String subjectI18n;
	String msgI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameI18n() {
		return nameI18n;
	}
	public void setNameI18n(String nameI18n) {
		this.nameI18n = nameI18n;
	}
	public String getEmailI18n() {
		return emailI18n;
	}
	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
	}
	public String getSubjectI18n() {
		return subjectI18n;
	}
	public void setSubjectI18n(String subjectI18n) {
		this.subjectI18n = subjectI18n;
	}
	public String getMsgI18n() {
		return msgI18n;
	}
	public void setMsgI18n(String msgI18n) {
		this.msgI18n = msgI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
