package com.capgemini.assignment.Day07b;

import java.util.Scanner;

public class MainClass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("1. Balance Enquiry \n2. Deposit\n3. Withdraw\nEnter your choice (1 or 2): ");
		int choice = sc.nextInt();
		while (choice == 1 || choice == 2 || choice == 3) {
			if (choice == 1)
				balanceEnq();
			else if (choice == 2)
				deposit();
			else if (choice == 3)
				withdraw();
			else
				System.out.print("************************************\n"
						+ "1. Balance Enquiry\n2. Deposit\n3. Withdraw" + "Enter correct choice (1, 2 or 3): ");
			System.out.print("Press 0 to exit.\nOr, enter your choice to continue transaction: ");
			choice = sc.nextInt();
			if (choice == 0)
				System.out.println("-------------------------------------------------\nFarewell. Have a great day!");
		}
		sc.close();

	}

	private static void balanceEnq() {

		BalanceInquiry be = new BalanceInquiry();
		System.out.print("Enter your Account Number: ");
		be.execute(sc.nextInt());
	}

	private static void deposit() {

		Deposit ds = new Deposit();

		System.out.print("Enter your Account Number: ");
		int ac = sc.nextInt();
		ds.setAccountNumber(ac);
		System.out.print("Enter the amount to be deposited in account number " + ac + ": $");
		ds.execute(sc.nextInt());
	}

	private static void withdraw() {

		Transaction wd = new Withdraw();

		System.out.print("Enter your Account Number: ");
		int ac = sc.nextInt();
		wd.setAccountNumber(ac);
		System.out.print("Enter the amount to be withdrawn from account number " + ac + ": $");
		wd.execute(sc.nextInt());

	}

}
