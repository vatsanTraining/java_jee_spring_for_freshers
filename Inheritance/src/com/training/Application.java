package com.training;

import com.training.model.*;
import com.training.services.LoanService;
import com.training.services.UpdateLoanServce;

public class Application {

	public static void main(String[] args) {

		
//		Loan loan1 = new Loan(102,"Ramesh",670);
//		
//		System.out.println(loan1.findRateOfInterest());
//		
//		
//		Loan loan2 = new Loan(103,"Rakesh",570);
//		System.out.println(loan2.findRateOfInterest());
//		
//		
//		Loan loan3 = new Loan(104,"Rajesh",780);
//		System.out.println(loan3.findRateOfInterest());
//		
		Loan loan4 = new HousingLoan(105, "Vikcy", 760, "apt", "metro");
		
		System.out.println(loan4.findRateOfInterest());
		
		LoanService service = new LoanService();
		
		System.out.println(service.getLoan(1));
		
		LoanService updateService = new UpdateLoanServce();
		
		  System.out.println(updateService.getLoan(2));
		  
	}

}
