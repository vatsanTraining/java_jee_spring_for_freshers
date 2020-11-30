package com.training.services;

import com.training.models.BankAccount;
import com.training.models.SavingsAccount;

public class BankAccountService {

	
	public static void main(String[] args) {
		
		
		BankAccount ramsAccount = new SavingsAccount(1000, "Ramesh", 1000, "Suresh");
		
		ramsAccount.deposit(1000);
		ramsAccount.deposit(2000);
		
		System.out.println("Balance Afer Deposit ===="+ramsAccount.getBalance());
		
		ramsAccount.withdraw(500);
		ramsAccount.withdraw(1500);
		
		System.out.println("Balance Afer Withdrawl ===="+ramsAccount.getBalance());
		
		ramsAccount.withdraw(1500);
		
		System.out.println("Withdraw beyound minimum balance ====="+ramsAccount.getBalance());
		
		// For the Business Account the minimum balance to be maintained is  10000 
		// and the minimum amount to deposit is 5000 or above 
		
		
		
	}
}
