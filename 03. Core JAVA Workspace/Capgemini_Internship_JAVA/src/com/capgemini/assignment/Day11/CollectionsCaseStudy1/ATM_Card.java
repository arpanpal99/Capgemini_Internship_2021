package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

public class ATM_Card implements BankCustomer, Account {

	private int pin;
	private long cardID;
	private Account acc;
	
	
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int number) {
		this.pin = number;
	}
	@Override
	public void CalculateInterest() {
		// TODO Auto-generated method stub
		
	}
	
	
}
