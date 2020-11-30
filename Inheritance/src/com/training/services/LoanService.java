package com.training.services;

import com.training.model.Loan;

public class LoanService {

	
	public String doxRequired() {
		
		return "PanCard,DL,SalarySlip";
	}
	
	public Loan getLoan(int key) {
		
		if(key==1) {
			
			return new Loan(100,"Suresh",670);
		} else {
			return null;
		}
	}
}
