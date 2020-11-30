package com.training.services;

public class NumberService {


	public NumberService() {
		super();
	}
	
	public int sumNumbers(int upto) {
		
		int count =0;
		
		for(int i =0;i<=upto;i++) {
			
			count =count+ i;
		}
		
    return count;		
		
	}
}
