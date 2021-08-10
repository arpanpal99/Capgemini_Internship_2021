package com.capgemini.assignment.Day11.CollectionsCaseStudy;

import java.util.Scanner;

public class Transaction extends CustomerDatabase {

	static Scanner sc = new Scanner(System.in);
	private static int custID;
	public static void Start() {
		System.out.println("*****************************************");
		System.out.println("Welcome to Transaction Portal of our Bank");
		System.out.println("*************************************************");
		System.out.print("Enter your Customer ID to begin transaction: ");
		custID = sc.nextInt();
		System.out.println("--------------------------------------------------");
		custItr = custList.iterator();
		while(custItr.hasNext()) {
			Account cc = custItr.next();
			if(cc.getCustID() == custID) {
				System.out.print("Deposit amount in account: ");
				cc.deposit(sc.nextDouble());
				System.out.print("Withdraw amount in account: ");
				cc.withdraw(sc.nextDouble());
				System.out.println("Displaying the final account details:");
				CustomerDatabase.displayCustDatabase(cc);
				break;
			}
			else {
				System.out.println("Wrong Customer ID..!");
				break;
			}
		}
	}
}
