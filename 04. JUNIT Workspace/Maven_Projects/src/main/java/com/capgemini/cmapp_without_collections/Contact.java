package com.capgemini.cmapp_without_collections;

import java.util.Scanner;

public class Contact {

	private String firstName = "Mark";
	private String lastName = "Rober";
	private String mobileNumber = "0987561452";

	public Contact() {
		super();
	}

	public Contact(String fName, String lName, String mNumber) {
		super();
		this.firstName = fName;
		this.lastName = lName;
		this.mobileNumber = mNumber;
	}

	Scanner sc = new Scanner(System.in);

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String validateFirstName(String fName) {
		if (fName == null || fName.equals(""))
			return "* First Name cannot be null";
		else
			return "* First Name is valid";
	}

	public String validateLastName(String lName) {
		if (lName == null || lName.equals(""))
			return "* Last Name cannot be null";
		else
			return "* Last Name is valid";
	}

	public String validateMobileNo(String mobNo) {
		if (mobNo.length() != 10)
			return "* Mobile number cannot be less than 10 digits";
		else if (!mobNo.matches("\\d+"))
			return "* Mobile number can contain only digits";
		else if (!mobNo.startsWith("0"))
			return "* Mobile number should start with 0";
		else
			return "* Mobile number is valid";
	}

	public void readDetails() {
		System.out.println("***********************************" + "\nEnter the details of the contact: ");
		System.out.print("Enter the first name: \t");
		sc.nextLine();
		firstName = sc.nextLine();
		System.out.print("Enter the last name: \t");
		sc.nextLine();
		lastName = sc.nextLine();
		System.out.print("Enter Mobile number: \t");
		sc.nextLine();
		mobileNumber = sc.nextLine();
	}

	public void validateReadDetails() {
		System.out.println("Enter the details of Contact");

		System.out.print("Enter the first name: \t");
		System.out.println(validateFirstName(firstName));

		System.out.print("Enter the last name: \t");
		System.out.println(validateLastName(lastName));

		System.out.print("Enter Mobile number: \t");
		System.out.println(validateMobileNo(mobileNumber));
	}

	public String displayDetails() {
		String st = new String("The mobile number of " + firstName + " " + lastName + " is: " + mobileNumber);
		// System.out.println(st);
		return st;
	}
}
