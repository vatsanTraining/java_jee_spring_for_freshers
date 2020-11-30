package com.training.models;

public class ThreadCommuncation {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		
		Thread t1 = new Thread() {
			
			public void run() {
				account.withdraw(6000);
				System.out.println("Withdraw 6000:="+account.getBalance());
			}
		};
		
		t1.start();
		
    Thread t2 = new Thread() {
			
			public void run() {
				account.deposit(4000);
			 	System.out.println("Deposit 4000 :="+account.getBalance());
			}
		};
		
		t2.start();
		
		System.out.println("Balance =:INR: "+account.getBalance());
	}

}
