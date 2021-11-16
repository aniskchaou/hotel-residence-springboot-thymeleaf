package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.Invoice;
import com.dev.delta.entities.VAT;
import com.dev.delta.repositories.InvoiceRepository;
import com.dev.delta.repositories.VATRepository;

@Service
public class InvoiceService {

	@Autowired
	VATRepository vatRepository  ;
	
	public double calculateSubTotalPrice(InvoiceRepository invoiceRepository)
	{
		double res=0;
		for(Invoice i:invoiceRepository.findAll())
		{
			res+=Double.parseDouble(i.getPrice());
		}
		return res;
	}
	
	public double calculatetotalPrice(InvoiceRepository invoiceRepository)
	{
		
		VAT v=vatRepository.findById(1L).get();
		double res=0;
		res= calculateSubTotalPrice( invoiceRepository)* Double.parseDouble( v.getRate())/100;
		
		return (calculateSubTotalPrice( invoiceRepository)+res);
	}
	
	
	public double calculatevatrate(InvoiceRepository invoiceRepository)
	{
		
		VAT v=vatRepository.findById(1L).get();
		double res=0;
		res= calculateSubTotalPrice( invoiceRepository)* Double.parseDouble( v.getRate())/100;
		
		return res;
	}
	
	
	
}
