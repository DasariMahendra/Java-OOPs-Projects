package com.project.BankSystem;

public class CurrentAccount extends Account{

	public CurrentAccount(String accName, long accNum, double bal) {
		super(accName, accNum, bal);
	
	}
	

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs " +amount+" deposited to Current Account");
		
	}

	@Override
	public void withdraw(double amount) {
		double accLimit= balance-200;
		if(amount <= accLimit) {
			balance -= amount;
			System.out.println("Rs " +amount+" withdrawn from Current Account");
		}else {
			System.out.println("Account Limit exceeded! You can only withdraw Rs "+accLimit);
		}
		
	}


	@Override
	public String getAccountType() {
		return "Current Account";
	}


}
