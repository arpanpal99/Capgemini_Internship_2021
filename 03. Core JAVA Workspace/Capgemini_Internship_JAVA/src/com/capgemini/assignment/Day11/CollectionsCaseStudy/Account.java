package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Date;

public class Account extends BankCustomer {

	private double balance;
	
	public Account(int custID, String custName, int custAge, Date custDOB, String custEmail, long custMobileNum, double balance) {
		super(custID, custName, custAge, custDOB, custEmail, custMobileNum);
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean deposit(double amount) {
		System.out.println("Previous balance: " + getBalance());
		balance += amount;
		System.out.println("Deposited " + amount + " by " + getCustName());
		System.out.println("Present balance: " + getBalance());
		System.out.println("-----------------------------------------------");
		return true;
	}

	public boolean withdraw(double amount) {
		System.out.println("Previous balance: " + getBalance());
		balance -= amount;
		System.out.println("Withdrawn " + amount + " by " + getCustName());
		System.out.println("Present balance: " + getBalance());
		System.out.println("-----------------------------------------------");
		return true;
	}
}
