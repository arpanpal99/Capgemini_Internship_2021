package com.capgemini.practice.Day07.Polymorphism;

public class Polymorphism_MainClass {

	public static void main(String[] args) {
		// account one
		Polymorphism_SavingsAccount sa = new Polymorphism_SavingsAccount();
		sa.openAccount();
		sa.calculateInterest();
		sa.viewAccountDetails();
		sa.calculateInterest();// calling subclass method which has overrided the super class method

		// account two
		Polymorphism_SavingsAccount sa1 = new Polymorphism_SavingsAccount();
		sa1.openAccount();
		sa1.calculateInterest();
		sa1.viewAccountDetails();
		sa.calculateInterest(2);

		Polymorphism_Account acc = new Polymorphism_Account();
		acc.calculateInterest();// this calls super class calculate interest method
	}

}
