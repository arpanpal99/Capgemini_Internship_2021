package com.capgemini.practice.Day07.Polymorphism;

public final class Polymorphism_SavingsAccount extends Polymorphism_Account {

	public Polymorphism_SavingsAccount() {
		super();
	}

	int age;
	float si;
	final float rateOfInterest = 0.6f;

	public void readAge() {
		System.out.println("Enter the age of Account Holder");
		age = sc.nextInt();
	}

	public void calculateInterest() {
		// rateOfInterest = 0.5f;
		System.out.println("interest is calculated here.....");
		if (age < 60) {
			si = getAccBalance() * 0.5f;
		} else {
			si = getAccBalance() * rateOfInterest;
		}
		System.out.println("interest is calculated = " + si);
	}

	// overloading the method calculateInterest()
	public void calculateInterest(int yrs) {
		System.out.println("interest is calculated here.....");
		if (age < 60) {
			si = getAccBalance() * 0.5f * yrs;
		} else {
			si = getAccBalance() * rateOfInterest * yrs;
		}
		System.out.println("interest is calculated = " + si);
	}

}
