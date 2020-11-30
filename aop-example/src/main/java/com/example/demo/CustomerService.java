package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {

	public String findById(int id) {
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Ramesh";
	}
	
	
      public String[] findAll() {
		
    	  return new String[]{"Manish","Ramesh","Suresh","Magesh"};
	}
}
