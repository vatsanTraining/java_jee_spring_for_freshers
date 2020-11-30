package com.training.model;

public class HousingLoan extends Loan {

	private String housingType;
	private String locationType;
	public HousingLoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public HousingLoan(int loanId, String applicantName, int cibilScore, String housingType, String locationType) {
		// super(loanId, applicantName, cibilScore);
		this.housingType = housingType;
		this.locationType = locationType;
	}


	@Override
	public double findRateOfInterest() {

		double rateOfInterst =9.0;
		
		if(housingType.equals("apt") && locationType.equals("metro")) {
				if(getCibilScore()< 650) {
					return  7.5; 
				} else { 
					return 6.2;
					}
		}
		 return rateOfInterst;
	}
	@Override
	public String toString() {
		return "HousingLoan [housingType=" + housingType + ", locationType=" + locationType + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
