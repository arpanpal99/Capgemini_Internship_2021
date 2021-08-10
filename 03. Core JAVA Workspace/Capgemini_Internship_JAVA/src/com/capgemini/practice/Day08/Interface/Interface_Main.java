package com.capgemini.practice.Day08.Interface;

import java.util.Scanner;



public class Interface_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		Interface_SavingsAccount sa = new Interface_SavingsAccount();
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("addMoney");
			System.out.println("withDrawMoney");
			System.out.println("CheckBal");
			String option = sc.next();
			switch (option) {
			case "addMoney":
				sa.addAmount();
				break;
			case "withDrawMoney":
				sa.withDrawAmount();
				break;
			case "CheckBal":
				sa.checkAccountBalance();
				break;
			default:
				System.out.println("Not valid option");

			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} // while close
		
	}

}
