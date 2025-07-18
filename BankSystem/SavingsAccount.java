package com.project.BankSystem;

public class SavingsAccount extends Account{

	public SavingsAccount(String accName, long accNum, double bal) {
		super(accName, accNum,  bal);
		
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs "+amount +" deposited to Savings Account");
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Rs "+amount +" withdrawn from Savings Account");
		}else {
			System.out.println("Insufficient balance n Savings Account");
		}
		
	}

	@Override
	public String getAccountType() {
		return "Savings Account";
	}
	
}
