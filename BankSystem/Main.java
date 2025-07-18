package com.project.BankSystem;

import java.util.*;

public class Main {

	static Map<Long, Account> accountMap = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("----- BANK SYSTEM -----");
			System.out.println("1.Create Account");
			System.out.println("2.Deposit Amount");
			System.out.println("3.Withdraw Amount");
			System.out.println("4.Display Balance");
			System.out.println("5.Exit");
			System.out.println("Choose an Option: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: createAccount();
				break;
			case 2: performDeposit();
				break;
			case 3: performWithdraw();
				break;
			case 4: displayBalance();
				break;
			case 5:
				System.out.println("Thank you... Visit Again!");
				sc.close();
				return;
			default:
				System.out.println("Invalid Option. Try Again!");
			}
		}
	}

	private static void createAccount() {
		System.out.println("Enter Account Holder name: ");
		String accName = sc.nextLine();
		
		Long accNum = (long) (Math.random() * 9_000_000_000_000L) + 1_000_000_000_000L;
        System.out.println("Account Number is: " + accNum);
       
		
		System.out.println("Enter a initial amount to deposit: ");
		double deposit = sc.nextDouble();
		
		System.out.println("Select Account Type: ");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		int type = sc.nextInt();
		
		Account account;
		if(type == 1) {
			account = new SavingsAccount(accName, accNum, deposit);
		}else if(type == 2) {
			account = new CurrentAccount(accName, accNum, deposit);
		}else {
			System.out.println("Invalid Account Type!");
			return;
		}
		
		accountMap.put(accNum, account);
		System.out.println("Account created Successfully");
		
	}
	
	private static void performDeposit() {
		System.out.println("Enter a Account Number: ");
		long accNum = sc.nextLong();
		Account acc = accountMap.get(accNum);
		
		if(acc != null) {
			System.out.println("Enter Amount to Deposit: ");
			double amount = sc.nextDouble();
			acc.deposit(amount);
		}else {
			System.out.println("Account not found");
		}
		
	}
	
	private static void performWithdraw() {
		System.out.println("Enter a Account Number: ");
		long accNum = sc.nextLong();
		Account acc = accountMap.get(accNum);
		
		if(acc != null) {
			System.out.println("Enter Amount to withdraw: ");
			double amount = sc.nextDouble();
			acc.withdraw(amount);
		}else {
			System.out.println("Account not found");
		}
		
	}
	
	private static void displayBalance() {
		System.out.println("Enter a Account Number: ");
		long accNum = sc.nextLong();
		Account acc = accountMap.get(accNum);
		
		if(acc != null) {
			acc.diplayBalance();
		}else {
			System.out.println("Account not found");
		}
		
	}
}
