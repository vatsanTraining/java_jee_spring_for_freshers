package com.training;

import com.training.model.Invoice;
import com.training.utils.InvoiceComparators;

import java.util.*;

public class SetAndMap {

	// varargs - variable arguments
	public static Collection<Invoice> createHashSet(Invoice ...invoices ) {
		
		HashSet<Invoice> invoiceSet = new HashSet<>();
		
		for(Invoice eachInvoice: invoices) {
			
			System.out.println(invoiceSet.add(eachInvoice));
		}
		
		
		print(invoiceSet);
		
		return invoiceSet;
		
	}
	
	public static void createTreeSet(Invoice ...invoices) {
		
		// Using Default Constructor
	//	TreeSet<Invoice> treeSet = new TreeSet<Invoice>();
		
		InvoiceComparators comparators = new InvoiceComparators();
		
		// Using Parameterized constructor which takes comparator
		TreeSet<Invoice> treeSet = new TreeSet<Invoice>(comparators.new InvoiceAmountComparator());
		
		for(Invoice eachInvoice: invoices) {
			System.out.println(treeSet.add(eachInvoice));
		}
		
		print(treeSet);
	}
	
	public static void print(Set<Invoice> collection) {
		
		for(Invoice eachInvoice:collection) {
			System.out.println(eachInvoice);
		}
		
	}
	
    public static void print(Map<String,Invoice> collection) {
		
		Set<Map.Entry<String, Invoice>> set = collection.entrySet();
		
		for(Map.Entry<String, Invoice> eachEntry: set) {
			
			System.out.println(eachEntry.getKey() + " : "+eachEntry.getValue());
			
		}
	}
	
	public static void createHashMap(Invoice ...invoices) {
		
		HashMap<String, Invoice> map = new HashMap<String, Invoice>();
		
		for(Invoice eachInvoice: invoices) {
			
			System.out.println(map.put(eachInvoice.getCustomerName(), eachInvoice));
		}
		
		System.out.println("getting value from map:="+map.get("Ramesh"));
		
		print(map);
	}
	
	public static void main(String[] args) {

       Invoice inv1 = new Invoice(101,"Ramesh",6700);
		
		Invoice inv2 = new Invoice(201,"Sumit",1700);
		
		Invoice inv3 = new Invoice(150,"Anoop",7000);
		
		Invoice inv4 = new Invoice(150,"Anoop",7000);
		
//		createHashSet(inv1,inv2,inv3,inv4);
//		
//		System.out.println("=================");
//		createTreeSet(inv1,inv2,inv3,inv4);
//		
		
		createHashMap(inv1,inv2,inv3,inv4);
	
		
	}

}
