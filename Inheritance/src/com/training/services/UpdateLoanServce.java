package com.training.services;

import com.training.model.HousingLoan;

public class UpdateLoanServce extends LoanService {

	// Compatible Return type is used 
	@Override
	public HousingLoan getLoan(int key) {

	if(key==2) {
		return new HousingLoan(900, "manish", 788, "ind", "nonmetro");
	}else {
		// Casting super class to subclass- down casting
		return (HousingLoan) super.getLoan(key);
	}
	}

	
	
}
