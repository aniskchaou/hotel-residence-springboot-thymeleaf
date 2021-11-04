package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InformationHotelI18n {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nameI18n;
	String descriptionI18n;
	String adressI18n;
	String emailI18n;
	String telephoneI18n;
	String facebookI18n;
	String instagramI18n;
	String twitterI18n;
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
	public String getDescriptionI18n() {
		return descriptionI18n;
	}
	public void setDescriptionI18n(String descriptionI18n) {
		this.descriptionI18n = descriptionI18n;
	}
	public String getAdressI18n() {
		return adressI18n;
	}
	public void setAdressI18n(String adressI18n) {
		this.adressI18n = adressI18n;
	}
	public String getEmailI18n() {
		return emailI18n;
	}
	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
	}
	public String getTelephoneI18n() {
		return telephoneI18n;
	}
	public void setTelephoneI18n(String telephoneI18n) {
		this.telephoneI18n = telephoneI18n;
	}
	public String getFacebookI18n() {
		return facebookI18n;
	}
	public void setFacebookI18n(String facebookI18n) {
		this.facebookI18n = facebookI18n;
	}
	public String getInstagramI18n() {
		return instagramI18n;
	}
	public void setInstagramI18n(String instagramI18n) {
		this.instagramI18n = instagramI18n;
	}
	public String getTwitterI18n() {
		return twitterI18n;
	}
	public void setTwitterI18n(String twitterI18n) {
		this.twitterI18n = twitterI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
