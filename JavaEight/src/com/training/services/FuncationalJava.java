package com.training.services;

import com.training.ifaces.Converter;

public class FuncationalJava {

	
	public double useConverter(Converter<Double, Double> conv,double value) {
		
		 return conv.convert(value);
	}
	
	public static void show(String string) {
		
		System.out.println("========="+string.length());
	}
}
