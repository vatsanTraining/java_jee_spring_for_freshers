package com.training.models;

public  class BusinessAccount extends BankAccount {

	private String businessType;
	
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(int accountNumber, String accountHolderName, double balance, String businessType) {
		super(accountNumber, accountHolderName, balance);
		this.businessType = businessType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
