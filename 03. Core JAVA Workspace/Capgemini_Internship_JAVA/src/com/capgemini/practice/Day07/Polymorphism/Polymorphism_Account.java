package com.capgemini.practice.Day07.Polymorphism;

import java.util.Scanner;

public class Polymorphism_Account {
	private int accId;
	private String accHolderName;
	private float accBalance;
	Scanner sc = new Scanner(System.in);

	public Polymorphism_Account() {
		super();
	}

	public Polymorphism_Account(int accId, String accHolderName, float accBalance) {
		super();
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}

	public void openAccount() {
		System.out.println("Enter account details");
		System.out.println("Enter account Id");
		accId = sc.nextInt();
		System.out.println("Enter account Holder Name");
		sc.nextLine();
		accHolderName = sc.nextLine();
		System.out.println("Enter the deposit amount");
		accBalance = sc.nextFloat();
	}

	public void viewAccountDetails() {
		System.out.println("Account details  :  ");
		System.out.println("Account Id  :  " + accId);
		System.out.println("Account Holder Name  :  " + accHolderName);
		System.out.println("Balance amount :  " + accBalance);
	}

	public void calculateInterest() {
		System.out.println("interest is calculated here.....");
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

}
