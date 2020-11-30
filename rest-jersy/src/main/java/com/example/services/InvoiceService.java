package com.example.services;
import java.util.*;

import com.training.model.Invoice;
public class InvoiceService {

	
	private  Map<Integer,Invoice> invoiceList ;

	
	public InvoiceService() {
		super();
		
		System.out.println("Inside Constructor");
		 invoiceList = new HashMap<Integer, Invoice>();
		 invoiceList.put(1919,new Invoice(1919,"Ramesh",4500));
		  invoiceList.put(2020,new Invoice(2020,"Ramesh",14500));
	}
		public Invoice add(Invoice inv) {
			Invoice addedElement = null;
			
			Invoice added= invoiceList.put(inv.getInvoiceNumber(),inv);
				
			if(added==null) {
				addedElement =inv;
			}
				return addedElement;
	}
	public Invoice findById(int key) {
					return invoiceList.get(key);
	}
		public Map<Integer,Invoice> findAll(){
			return this.invoiceList;
	}
		
		public Invoice removeById(int key) {
			
			Invoice deleted =null;
			if(this.invoiceList.containsKey(key)) {
				
				deleted =this.invoiceList.remove(key);
			}
			
			return deleted;
		}
}
