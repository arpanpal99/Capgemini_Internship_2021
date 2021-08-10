package com.capgemini.practice.Day08.Interface;

import java.util.Scanner;

public class Interface_SavingsAccount implements Interface_BankAccount {
	int accId;
	String accHolderName;
	float minBal = 5000;
	float actualBal;
	String address;
	String accType =  "Savings";;
	Scanner details = new Scanner(System.in);
	float rateOfInt =  0.3f;
	int withDrawAmt;
	int depAmt;
	public Interface_SavingsAccount() {
		super();//default constructor of the super class is called
	}
	
	@Override
	public void createNewAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter accid");
		accId = details.nextInt();
		System.out.println("Enter accHolderName");
		details.nextLine();
		accHolderName = details.nextLine();
		System.out.println("Enter actualBal");
		actualBal = details.nextInt();
		System.out.println("Enter address");
		details.nextLine();
		address = details.nextLine();
	}

	@Override
	public void addAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to deposit");
		depAmt = details.nextInt();
		actualBal += depAmt;
		System.out.println("after with deposit balance = " + (actualBal));
		System.out.println("thank you");
	}

	@Override
	public void checkAccountBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("The balance in account = " + actualBal);
		
	}

	@Override
	public void withDrawAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to withdraw");
		withDrawAmt = details.nextInt();
		actualBal -= withDrawAmt;
		System.out.println("after with draw balance = " +( actualBal ));
		System.out.println("thank you");
	}

}
