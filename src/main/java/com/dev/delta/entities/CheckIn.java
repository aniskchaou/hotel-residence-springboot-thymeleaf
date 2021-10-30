package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CheckIn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@ManyToOne
	@JoinColumn(name = "guest_type_id")
	GuestType GuestType;
	String Fullname;
	String Email;
	String Mobile;
	String  Address;
	@ManyToOne
	@JoinColumn(name = "country_id")
	Country Country;
	@ManyToOne
	@JoinColumn(name = "city_id")
	City city;
	String Gender;
	String Age="0";
	String CheckIn;
	String CheckOut;
	String DurationofStay="0";
	String Adults="0" ;
	String Kids="0";
	String RoomPlan="";
	String BookedBy=""; 
	String VehicleNumber="000-000-000";
	String Remark="";
	String IDNo="00000000000000000";
	String NameOtherPerson;
	String GenderOtherPerson;
	String AgeOtherPerson;
	String AddressOtherPerson;
	String IDNoOtherPerson="00000000000000000";
	String AdvancePayment="0";
	String Status="Unpaid";
	
	
	public CheckIn() {
		// TODO Auto-generated constructor stub
	}


	
	

	public CheckIn(com.dev.delta.entities.GuestType guestType, String fullname, String email, String mobile,
			String address, com.dev.delta.entities.Country country, City city, String gender, String age,
			String checkIn, String checkOut, String durationofStay, String adults, String kids, String roomPlan,
			String bookedBy, String vehicleNumber, String remark, String iDNo, String nameOtherPerson,
			String genderOtherPerson, String ageOtherPerson, String addressOtherPerson, String iDNoOtherPerson,
			String advancePayment, String status) {
		super();
		GuestType = guestType;
		Fullname = fullname;
		Email = email;
		Mobile = mobile;
		Address = address;
		Country = country;
		this.city = city;
		Gender = gender;
		Age = age;
		CheckIn = checkIn;
		CheckOut = checkOut;
		DurationofStay = durationofStay;
		Adults = adults;
		Kids = kids;
		RoomPlan = roomPlan;
		BookedBy = bookedBy;
		VehicleNumber = vehicleNumber;
		Remark = remark;
		IDNo = iDNo;
		NameOtherPerson = nameOtherPerson;
		GenderOtherPerson = genderOtherPerson;
		AgeOtherPerson = ageOtherPerson;
		AddressOtherPerson = addressOtherPerson;
		IDNoOtherPerson = iDNoOtherPerson;
		AdvancePayment = advancePayment;
		Status = status;
	}





	public String getStatus() {
		return Status;
	}





	public void setStatus(String status) {
		Status = status;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GuestType getGuestType() {
		return GuestType;
	}

	public void setGuestType(GuestType guestType) {
		GuestType = guestType;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country country) {
		Country = country;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getCheckIn() {
		return CheckIn;
	}

	public void setCheckIn(String checkIn) {
		CheckIn = checkIn;
	}

	public String getCheckOut() {
		return CheckOut;
	}

	public void setCheckOut(String checkOut) {
		CheckOut = checkOut;
	}

	public String getDurationofStay() {
		return DurationofStay;
	}

	public void setDurationofStay(String durationofStay) {
		DurationofStay = durationofStay;
	}

	public String getAdults() {
		return Adults;
	}

	public void setAdults(String adults) {
		Adults = adults;
	}

	public String getKids() {
		return Kids;
	}

	public void setKids(String kids) {
		Kids = kids;
	}

	public String getRoomPlan() {
		return RoomPlan;
	}

	public void setRoomPlan(String roomPlan) {
		RoomPlan = roomPlan;
	}

	public String getBookedBy() {
		return BookedBy;
	}

	public void setBookedBy(String bookedBy) {
		BookedBy = bookedBy;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getIDNo() {
		return IDNo;
	}

	public void setIDNo(String iDNo) {
		IDNo = iDNo;
	}

	public String getNameOtherPerson() {
		return NameOtherPerson;
	}

	public void setNameOtherPerson(String nameOtherPerson) {
		NameOtherPerson = nameOtherPerson;
	}

	public String getGenderOtherPerson() {
		return GenderOtherPerson;
	}

	public void setGenderOtherPerson(String genderOtherPerson) {
		GenderOtherPerson = genderOtherPerson;
	}

	public String getAgeOtherPerson() {
		return AgeOtherPerson;
	}

	public void setAgeOtherPerson(String ageOtherPerson) {
		AgeOtherPerson = ageOtherPerson;
	}

	public String getAddressOtherPerson() {
		return AddressOtherPerson;
	}

	public void setAddressOtherPerson(String addressOtherPerson) {
		AddressOtherPerson = addressOtherPerson;
	}

	public String getIDNoOtherPerson() {
		return IDNoOtherPerson;
	}

	public void setIDNoOtherPerson(String iDNoOtherPerson) {
		IDNoOtherPerson = iDNoOtherPerson;
	}

	public String getAdvancePayment() {
		return AdvancePayment;
	}

	public void setAdvancePayment(String advancePayment) {
		AdvancePayment = advancePayment;
	}
	
	
	
}
