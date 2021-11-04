package com.dev.delta.i18n.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CheckInI18n {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String GuestTypeI18n;
	String FullnameI18n;
	String EmailI18n;
	String MobileI18n;
	String  AddressI18n;
	String CountryI18n;
	String cityI18n;
	String GenderI18n;
	String AgeI18n="0";
	String CheckInI18n;
	String CheckOutI18n;
	String DurationofStayI18n="0";
	String AdultsI18n="0" ;
	String KidsI18n="0";
	String RoomPlanI18n="";
	String BookedByI18n=""; 
	String VehicleNumberI18n="000-000-000";
	String RemarkI18n="";
	String IDNoI18n="00000000000000000";
	String NameOtherPersonI18n;
	String GenderOtherPersonI18n;
	String AgeOtherPersonI18n;
	String AddressOtherPersonI18n;
	String IDNoOtherPersonI18n="00000000000000000";
	String AdvancePaymentI18n="0";
	String paymentStatusI18n;
	String StatusI18n="Unpaid";
	String roomI18n;
	String cutomerI18n;
	String langI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGuestTypeI18n() {
		return GuestTypeI18n;
	}
	public void setGuestTypeI18n(String guestTypeI18n) {
		GuestTypeI18n = guestTypeI18n;
	}
	public String getFullnameI18n() {
		return FullnameI18n;
	}
	public void setFullnameI18n(String fullnameI18n) {
		FullnameI18n = fullnameI18n;
	}
	public String getEmailI18n() {
		return EmailI18n;
	}
	public void setEmailI18n(String emailI18n) {
		EmailI18n = emailI18n;
	}
	public String getMobileI18n() {
		return MobileI18n;
	}
	public void setMobileI18n(String mobileI18n) {
		MobileI18n = mobileI18n;
	}
	public String getAddressI18n() {
		return AddressI18n;
	}
	public void setAddressI18n(String addressI18n) {
		AddressI18n = addressI18n;
	}
	public String getCountryI18n() {
		return CountryI18n;
	}
	public void setCountryI18n(String countryI18n) {
		CountryI18n = countryI18n;
	}
	public String getCityI18n() {
		return cityI18n;
	}
	public void setCityI18n(String cityI18n) {
		this.cityI18n = cityI18n;
	}
	public String getGenderI18n() {
		return GenderI18n;
	}
	public void setGenderI18n(String genderI18n) {
		GenderI18n = genderI18n;
	}
	public String getAgeI18n() {
		return AgeI18n;
	}
	public void setAgeI18n(String ageI18n) {
		AgeI18n = ageI18n;
	}
	public String getCheckInI18n() {
		return CheckInI18n;
	}
	public void setCheckInI18n(String checkInI18n) {
		CheckInI18n = checkInI18n;
	}
	public String getCheckOutI18n() {
		return CheckOutI18n;
	}
	public void setCheckOutI18n(String checkOutI18n) {
		CheckOutI18n = checkOutI18n;
	}
	public String getDurationofStayI18n() {
		return DurationofStayI18n;
	}
	public void setDurationofStayI18n(String durationofStayI18n) {
		DurationofStayI18n = durationofStayI18n;
	}
	public String getAdultsI18n() {
		return AdultsI18n;
	}
	public void setAdultsI18n(String adultsI18n) {
		AdultsI18n = adultsI18n;
	}
	public String getKidsI18n() {
		return KidsI18n;
	}
	public void setKidsI18n(String kidsI18n) {
		KidsI18n = kidsI18n;
	}
	public String getRoomPlanI18n() {
		return RoomPlanI18n;
	}
	public void setRoomPlanI18n(String roomPlanI18n) {
		RoomPlanI18n = roomPlanI18n;
	}
	public String getBookedByI18n() {
		return BookedByI18n;
	}
	public void setBookedByI18n(String bookedByI18n) {
		BookedByI18n = bookedByI18n;
	}
	public String getVehicleNumberI18n() {
		return VehicleNumberI18n;
	}
	public void setVehicleNumberI18n(String vehicleNumberI18n) {
		VehicleNumberI18n = vehicleNumberI18n;
	}
	public String getRemarkI18n() {
		return RemarkI18n;
	}
	public void setRemarkI18n(String remarkI18n) {
		RemarkI18n = remarkI18n;
	}
	public String getIDNoI18n() {
		return IDNoI18n;
	}
	public void setIDNoI18n(String iDNoI18n) {
		IDNoI18n = iDNoI18n;
	}
	public String getNameOtherPersonI18n() {
		return NameOtherPersonI18n;
	}
	public void setNameOtherPersonI18n(String nameOtherPersonI18n) {
		NameOtherPersonI18n = nameOtherPersonI18n;
	}
	public String getGenderOtherPersonI18n() {
		return GenderOtherPersonI18n;
	}
	public void setGenderOtherPersonI18n(String genderOtherPersonI18n) {
		GenderOtherPersonI18n = genderOtherPersonI18n;
	}
	public String getAgeOtherPersonI18n() {
		return AgeOtherPersonI18n;
	}
	public void setAgeOtherPersonI18n(String ageOtherPersonI18n) {
		AgeOtherPersonI18n = ageOtherPersonI18n;
	}
	public String getAddressOtherPersonI18n() {
		return AddressOtherPersonI18n;
	}
	public void setAddressOtherPersonI18n(String addressOtherPersonI18n) {
		AddressOtherPersonI18n = addressOtherPersonI18n;
	}
	public String getIDNoOtherPersonI18n() {
		return IDNoOtherPersonI18n;
	}
	public void setIDNoOtherPersonI18n(String iDNoOtherPersonI18n) {
		IDNoOtherPersonI18n = iDNoOtherPersonI18n;
	}
	public String getAdvancePaymentI18n() {
		return AdvancePaymentI18n;
	}
	public void setAdvancePaymentI18n(String advancePaymentI18n) {
		AdvancePaymentI18n = advancePaymentI18n;
	}
	public String getPaymentStatusI18n() {
		return paymentStatusI18n;
	}
	public void setPaymentStatusI18n(String paymentStatusI18n) {
		this.paymentStatusI18n = paymentStatusI18n;
	}
	public String getStatusI18n() {
		return StatusI18n;
	}
	public void setStatusI18n(String statusI18n) {
		StatusI18n = statusI18n;
	}
	public String getRoomI18n() {
		return roomI18n;
	}
	public void setRoomI18n(String roomI18n) {
		this.roomI18n = roomI18n;
	}
	public String getCutomerI18n() {
		return cutomerI18n;
	}
	public void setCutomerI18n(String cutomerI18n) {
		this.cutomerI18n = cutomerI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
}
