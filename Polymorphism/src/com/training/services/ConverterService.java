package com.training.services;

import com.training.ifaces.Converter;
import com.training.models.CurrencyConverter;
import com.training.models.TempratureConverter;

public class ConverterService {

	
	
	public void print(Converter poly) {
		
		System.out.println(poly.convert());
	}
	
	public Converter getReference(int key) {
		
		switch (key) {
		case 1:
			
			return new CurrencyConverter();
		case 2:
			return new TempratureConverter();
		default:
			return null;
		}
		
		
		
	}
}
