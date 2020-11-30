package com.training;

import com.training.model.Invoice;
import com.training.services.InvoiceService;
import java.io.*;
public class Application {

	public static void main(String[] args) {

		
		File streamFile = new File("invoice.ser");
		
		InvoiceService streamService = new InvoiceService(streamFile);
		
		File textFile = new File("invoice.txt");
		
		InvoiceService txtService = new InvoiceService(textFile);

		
		int key = 4;
				
	     if(key==1) {
		Invoice ram = new Invoice(101,"Ramesh",4500);
		
		boolean result = streamService.writeToFile(ram);
	
			 if(result) {
				 System.out.println("One Object persited");
			   }
	     
	     }
		
		if(key==2) {
			
			Invoice inv = streamService.readFromFile();
			System.out.println(inv);
		}
		 
		if(key==3) {
			
			Invoice[] invList = {  new Invoice(104, "Magesh", 14500.00),
			                        new Invoice(105, "Manish", 25500.00),
			                       new Invoice(106, "Mayank", 14580.00)
			                      };
			
			for(Invoice eachInvoice:invList) {
				
				boolean result =txtService.writeToTextFile(eachInvoice);
			   
				 System.out.println(result);
			}
		}
			if(key==4) {
			
			 Invoice[] list = txtService.readFromTextFile();
			
			  for(Invoice eachInvoice:list) {
				  
				  if(eachInvoice!=null) {
				     System.out.println(eachInvoice);
				  }
			  }
			}
		}
	
	

}
