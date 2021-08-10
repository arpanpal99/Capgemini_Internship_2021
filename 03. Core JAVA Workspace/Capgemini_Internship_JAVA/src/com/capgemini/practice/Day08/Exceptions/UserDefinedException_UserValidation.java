package com.capgemini.practice.Day08.Exceptions;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserDefinedException_UserValidation {

	private static final String regContact = "^[0-9]{10}$";

	static void validate(String contact) throws InvalidContactException {

		if (!(Pattern.matches(regContact, contact)))
			throw new InvalidContactException("\nMobile number not valid");
		else
			System.out.println("Mobile Number Accepted");
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contact number: ");
		String contact = sc.nextLine();
		System.out.println("****************************");
		try {
			validate(contact);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("****************************\nPROCEED FURTHER");
		sc.close();
	}
}