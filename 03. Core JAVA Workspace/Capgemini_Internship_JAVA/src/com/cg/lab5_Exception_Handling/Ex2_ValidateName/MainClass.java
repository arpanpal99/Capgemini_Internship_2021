package com.cg.lab5_Exception_Handling.Ex2_ValidateName;

import java.util.Scanner;

public class MainClass {
	static void validate(String firstName, String lastName) throws NameException {
		if (firstName.isEmpty() && lastName.isEmpty())
			throw new NameException("\nException cause: Whole name field is empty");
		else if (lastName.isEmpty())
			throw new NameException("\nException cause: Last Name field is empty");
		else if (firstName.isEmpty())
			throw new NameException("\nException cause: First Name field is empty");
		else
			System.out.println("Welcome to our Portal, " + firstName + " " + lastName + "!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your firstname: ");
		String fName = sc.nextLine();
		System.out.print("Enter your lastname: ");
		String lName = sc.nextLine();
		try {
			validate(fName, lName);
		} catch (Exception e) {
			System.out.println("Exception occurred! Naming Convention Invalid\n" + e);
			System.out.println("-----------------------------------------");
		}
		sc.close();
	}
}
