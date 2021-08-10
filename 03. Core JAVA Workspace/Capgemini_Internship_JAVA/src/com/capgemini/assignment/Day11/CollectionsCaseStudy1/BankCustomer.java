package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

public abstract interface BankCustomer extends ATM, CashDispenser {

	public String customerName = "";
	public String address = "";
	public String email = "";
	public ATM_Card card = null;
	public Account acc = null;
	
	
	
	public static void InsertCard() {
		
	}
	
	public static void SelectTransaction() {
		
	}
	
	public static void EnterPin(int number) {
		
	}
	
	public static void ChangePin() {
		
	}
	
	public static void WithdrawCash() {
		
	}
	
	static void TransactionSummary() {
		
	}
	
	static void AcceptAmount() {
		
	}
	
}
