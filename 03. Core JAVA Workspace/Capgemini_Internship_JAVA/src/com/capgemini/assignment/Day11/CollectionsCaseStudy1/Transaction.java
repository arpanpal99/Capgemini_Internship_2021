package com.capgemini.assignment.Day11.CollectionsCaseStudy1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Transaction implements Account {

	private SimpleDateFormat sdf = new SimpleDateFormat();
	private double amount;
	private double deposit;
	
	public double CalculateBalance(int number) {
		return 0;
	}
	
	public void StartTransaction() {
		int choice = 1;
		while (choice != 4) {
			System.out.println("********************************");
			System.out.print("1. Balance Enquiry \n2. Deposit\n3. Withdraw\n4. Exit\nEnter your choice: ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Welcome to Balance Inquiry Portal");
				System.out.println("---------------------------------");
				GetAccountBalance();
			}
			else if (choice == 2) {
				System.out.println("Welcome to Deposit Portal");
				System.out.println("-------------------------");
				//deposit();
			}
			else if (choice == 3) {
				System.out.println("Welcome to Withdraw Portal");
				System.out.println("--------------------------");
				//withdraw();
			}
			else if (choice == 4) {
				CancelTransaction();
			}
			else { 
				System.out.println("Wrong Choice! Enter correct option among 1/2/3/4");
			}
		}
	}
	
	public double GetAccountBalance() {
		return balance;
	}	
	
	public void CancelTransaction() {
		System.out.println("-------------------------------------------------\nFarewell. Have a great day!");
	}
	@Override
	public void CalculateInterest() {
		// TODO Auto-generated method stub
		
	}
	
}
