package com.cg.lab4_Inheritance_Polymorphism.Ex1_SavCurrAccount;

public class currAccount extends Account {
	private double overdraftLimit;

	@Override
	public boolean withdraw(double amount) {
		overdraftLimit = getBalance();
		if (amount < overdraftLimit) {
			super.withdraw(amount);
			return true;
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println(getName() + ", " + amount + " can't be withdrawn. \nOverdraft limit reached!");
			System.out.println("Transaction failed!");
			System.out.println("-----------------------------------------------");
			return false;
		}
	}
}