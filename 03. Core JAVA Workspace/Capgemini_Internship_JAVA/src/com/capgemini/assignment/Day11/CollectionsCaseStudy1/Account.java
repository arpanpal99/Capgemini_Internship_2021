package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

public abstract interface Account extends BankCustomer {

	public int accountNumber = 12345;
	public double balance = 50000;
	
	
	public void CalculateInterest();
	
	public static void UpdateAccount() {
		
	}
	
	public static void VerifyWithdrawAmount() {
		
	}
	public static void main(String[] args) {
		
		Transaction trans = new Transaction();
		
		trans.StartTransaction();
		sc.close();

	}
}
