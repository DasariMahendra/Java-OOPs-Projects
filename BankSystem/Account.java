package com.project.BankSystem;

abstract class Account {

	private String accountHolder;
	private String accountType;
	private long accountNumber;
	protected double balance;
	

	public Account(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	
	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	
	public String getAccountType() {
		return "Generic Account";
	}

	
	public void diplayBalance() {
		System.out.println("----- ACCOUNT DETAILS -----");
		System.out.println("Account Holder: " +accountHolder);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Type: " +getAccountType());
		System.out.println("Current Balance: " +balance);
	}
	
}
