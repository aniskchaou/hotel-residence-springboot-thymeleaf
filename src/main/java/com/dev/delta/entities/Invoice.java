package com.dev.delta.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "create_at")
	private String createAt;
		
	  @ManyToMany
	    @JoinTable(name = "items_invoice",joinColumns =  @JoinColumn(name = "service_id"),
	    	    inverseJoinColumns = @JoinColumn(name="items_id"))
	private List<Service> items;
	
	@ManyToOne
	@JoinColumn(name = "vat_id")
	VAT vat;
	
	@ManyToOne
	@JoinColumn(name = "checkin_id")
	CheckIn  checkIn;
	
	String total;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	

	public CheckIn getCheckIn() {
		return checkIn;
	}



	public void setCheckIn(CheckIn checkIn) {
		this.checkIn = checkIn;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}

	

	public List<Service> getItems() {
		return items;
	}

	public void setItems(List<Service> items) {
		this.items = items;
	}

	public VAT getVat() {
		return vat;
	}

	public void setVat(VAT vat) {
		this.vat = vat;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
}
