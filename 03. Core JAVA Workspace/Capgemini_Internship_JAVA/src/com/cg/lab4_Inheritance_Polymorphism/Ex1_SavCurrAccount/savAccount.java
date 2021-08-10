package com.cg.lab4_Inheritance_Polymorphism.Ex1_SavCurrAccount;

public class savAccount extends Account {
	final private int minimumBalance = 500;

	@Override
	public boolean withdraw(double amount) {
		if (amount < minimumBalance) {

			super.withdraw(amount);
			return true;
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println(getName() + ", " + amount + " can't be withdrawn. \nBalance must be atleast "
					+ minimumBalance + "!\nTransaction failed!");
			return false;
		}
	}
}