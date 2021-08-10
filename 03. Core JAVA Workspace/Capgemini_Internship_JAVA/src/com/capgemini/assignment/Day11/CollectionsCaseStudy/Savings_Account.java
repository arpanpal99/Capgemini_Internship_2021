package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Date;

public class Savings_Account extends Account {

	public Savings_Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings_Account(int custID, String custName, int custAge, Date custDOB, String custEmail, long custMobileNum, double balance) {
		super(custID, custName, custAge, custDOB, custEmail, custMobileNum, balance);
		// TODO Auto-generated constructor stub
	}

	final private int minimumBalance = 5000;

	@Override
	public boolean withdraw(double amount) {
		if ((getBalance() - amount) >= minimumBalance) {

			super.withdraw(amount);
			return true;
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println(getCustName() + ", " + amount + " can't be withdrawn. \nBalance must be atleast "
					+ minimumBalance + "!\nTransaction failed!");
			return false;
		}
	}
}
