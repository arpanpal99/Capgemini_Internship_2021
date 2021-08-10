package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Date;

public class Current_Account extends Account {

	public Current_Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current_Account(int custID, String custName, int custAge, Date custDOB, String custEmail, long custMobileNum, double balance) {
		super(custID, custName, custAge, custDOB, custEmail, custMobileNum, balance);
		// TODO Auto-generated constructor stub
	}

	private double overdraftLimit;

	@Override
	public boolean withdraw(double amount) {
		overdraftLimit = getBalance();
		if (amount < overdraftLimit) {
			super.withdraw(amount);
			return true;
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println(getCustName() + ", " + amount + " can't be withdrawn. \nOverdraft limit reached!");
			System.out.println("Transaction failed!");
			System.out.println("-----------------------------------------------");
			return false;
		}
	}
}
