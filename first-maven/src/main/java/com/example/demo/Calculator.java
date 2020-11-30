package com.example.demo;

import java.util.List;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {

	Logger log = Logger.getLogger(this.getClass().getName());
	
	public double calculate(String ... values) throws NumberFormatException,ArrayIndexOutOfBoundsException{
		
		double result =0;
		
			int number = Integer.parseInt(values[1]);
			
		    log.info("Values entered is "+ number);
		    
		     if(number < 0) {
					log.error("Invalid Number - Should be Positive Integer");
		     }
			try {
				log.debug("Going To Sleep");

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				log.debug("Catch Block Interrputed Exception");

				e.printStackTrace();
			}
			
			result = number * 10;
			
						log.info("Completed Calculate method");
		return result;
		  
	}
	
	public String getNameFromList(int idxPos) {
		
		List<String> nameList = 
				  Arrays.asList("Ganesh",null,"Suresh",null,"Manish","Aman");
		
		return nameList.get(idxPos);
		
	}
}
