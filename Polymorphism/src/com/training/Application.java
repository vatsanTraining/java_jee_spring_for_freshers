package com.training;

import com.training.ifaces.Converter;
import com.training.models.CurrencyConverter;
import com.training.models.TempratureConverter;
import com.training.services.ConverterService;

public class Application {

	public static void main(String[] args) {

		
		Converter tempConv = new TempratureConverter(-40.0);
		
		Converter currConv = new CurrencyConverter(100);
		
		ConverterService service = new ConverterService();
		
		    service.print(currConv);
		    
		    service.print(tempConv);
		    
		    
		    int key=1;
		    
		    Converter convRef = service.getReference(key);
		    
		    
		    if(convRef instanceof TempratureConverter) {
		   
		    	TempratureConverter conv = (TempratureConverter)convRef;
		    	
		    	conv.setCelsius(-40.00);
		    
		    }
		    
		    if(convRef instanceof CurrencyConverter) {
		    	
		    	CurrencyConverter conv = (CurrencyConverter)convRef;
		    	conv.setIndianRupees(100);
		    }
		    
		     service.print(convRef);

	}

}
