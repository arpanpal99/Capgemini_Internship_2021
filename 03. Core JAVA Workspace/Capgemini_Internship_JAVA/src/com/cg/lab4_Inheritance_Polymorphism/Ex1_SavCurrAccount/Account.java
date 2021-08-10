package com.cg.lab4_Inheritance_Polymorphism.Ex1_SavCurrAccount;

public class Account extends Person {
	private long accNum;
	private double balance;
	private Person accHolder;

	public boolean deposit(double amount) {
		balance += amount;
		System.out.println("-----------------------------------------------");
		System.out.println("Deposited " + amount + " by " + getName());
		return true;
	}

	public boolean withdraw(double amount) {
		balance -= amount;
		System.out.println("-----------------------------------------------");
		System.out.println("Withdrawn " + amount + " by " + getName());
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long newAccNum) {
		this.accNum = newAccNum;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
}