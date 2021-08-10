package com.capgemini.practice.Day06.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InheritanceApplication {

	private int empId;
	private String empName;
	private String empDob;
	private String empDoj;
	Scanner sc = new Scanner(System.in);
	// creating date object
	Date dob = new Date();
	Date doj = new Date();
	/*
	 * SimpleDateFormat is a class to declare date format for converting string to
	 * date or date to another format
	 */
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

	public void addEmployee() throws ParseException {
		System.out.println("Enter employee details: ");
		System.out.println("Enter Employee Id");
		empId = sc.nextInt();
		System.out.println("Enter Employee name");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter Employee DOB(DD/MM/YYYY)");
		empDob = sc.next();
		dob = convertStringToDate(empDob);
		System.out.println("Enter Employee DOJ(DD/MM/YYYY)");
		empDoj = sc.next();
		doj = convertStringToDate(empDoj);
	}

	public Date convertStringToDate(String date) throws ParseException {

		Date stringToDate = sdf.parse(date);

		return stringToDate;

	}

	public void displayEmployeeDetails() {
		System.out.println("employee details are ...");
		System.out.println("Employee Id= " + empId);
		System.out.println("Employee Name= " + empName);
		System.out.println("Employee DOB= " + empDob);
		System.out.println("Employee DOJ= " + empDoj);

	}

}