package com.training.model;

public class Loan   {

	private int loanId;
	private String applicantName;
	private int cibilScore;
	
	public Loan() {
		super();
	}

	public Loan(int loanId, String applicantName, int cibilScore) {
		super();
		this.loanId = loanId;
		this.applicantName = applicantName;
		this.cibilScore = cibilScore;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	@Override
	public String toString() {
		return this.applicantName + this.cibilScore;
		
		// return super.toString() + this.applicantName + this.cibilScore;
	}
	
	public double findRateOfInterest() {
		
		double interestRate = 7.5;
		
		if(cibilScore<600) {
			
			interestRate = 9.0;
			
		} else if(cibilScore>=600 && cibilScore<=750) {
			
			interestRate =8.0;
		}
		
		return interestRate;
	}
	
}
