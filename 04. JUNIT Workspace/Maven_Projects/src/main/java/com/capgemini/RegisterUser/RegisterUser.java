package com.capgemini.RegisterUser;

import java.util.Scanner;

public class RegisterUser {

	// --------------------------------------------------------------------------------------------
	public RegisterUser() {
		super();
	}

	public RegisterUser(String firstName, String lastName, String mobileNo, String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
	}

	// --------------------------------------------------------------------------------------------
	private String firstName = "Ammy";
	private String lastName = "Adams";
	private String mobileNo = "0985687452";
	private String userName = "ammy_Adams"; // must contain - or _
	private String password = "ammy@2541"; // > 8 characters and < 16 characters
	// --------------------------------------------------------------------------------------------

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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// --------------------------------------------------------------------------------------------
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

	public String validateUserName(String userName) {
		if (userName == null)
			return "* Username can't be null";
		// else if(!userName.contains("-") || !userName.contains("_")) return "*
		// Username must contain either '-' or '_'";
		else if (userName.indexOf('-') == -1 && userName.indexOf('_') == -1)
			return "* Username must contain either '-'  or '_'";
		else
			return "* Username is valid";
	}

	public String validatePassword(String pwd) {
		if (pwd.length() < 8 || pwd.length() > 16)
			return "* Password must between 8 and 16 characters";
		else
			return "* Password is valid";
	}

	// --------------------------------------------------------------------------------------------
	public String displayDetails() {
		String st = new String("The mobile number of " + firstName + " " + lastName + " is: " + mobileNo);
		st += "\nUsername is: " + userName + ", and Password is: " + password;
		// System.out.println(st);
		return st;
	}

	// --------------------------------------------------------------------------------------------
	Scanner sc = new Scanner(System.in);

	public void validateReadDetails() {
		System.out.println("Enter the details of Contact");

		firstName = "Ammy";
		// System.out.print("Enter the first name: \t"); firstName = sc.nextLine();
		System.out.println(validateFirstName(firstName));
		lastName = "Adams";
		// System.out.print("Enter the last name: \t"); lastName = sc.nextLine();
		System.out.println(validateLastName(lastName));
		mobileNo = "0985687452";
		// System.out.print("Enter Mobile number: \t"); mobileNo = sc.nextLine();
		System.out.println(validateMobileNo(mobileNo));
		userName = "ammy_Adams";
		// System.out.print("Enter User Name: \t"); userName = sc.nextLine();
		System.out.println(validateUserName(userName));
		password = "ammy@2541";
		// System.out.print("Enter Password: \t"); password = sc.nextLine();
		System.out.println(validateUserName(password));
	}
	// --------------------------------------------------------------------------------------------

}
