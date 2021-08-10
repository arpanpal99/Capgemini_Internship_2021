package com.capgemini.practice.Day06.Inheritance;

import java.util.Scanner;
import java.util.Date;
import java.text.*;

public class Inheritance_Employee {
	private int empId;
	private String empName;
	private String empDob;
	private String empDoj;
	private float empSalary;
	Scanner sc = new Scanner(System.in);

	Date dob = new Date();
	Date doj = new Date();

	/*
	 * SimpleDateFormat is a class in java.text package to declare date format for
	 * converting string to date or date to another format SimpleDateFormat sdf =
	 * new SimpleDateFormat("dd/MM/yyyy");
	 * 
	 * SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy"); SimpleDateFormat
	 * sdf = new SimpleDateFormat("MM dd,yyyy"); SimpleDateFormat sdf = new
	 * SimpleDateFormat("dd-MMM-yyyy HH:mm:ss"); SimpleDateFormat sdf = new
	 * SimpleDateFormat("E,MMM dd yyyy"); SimpleDateFormat sdf = new
	 * SimpleDateFormat("E,MMM dd yyyy HH:mm:ss");
	 */
	// SimpleDateFormat is a class to declare date format for
	// converting string to date or date to another format
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public void addEmployee() throws ParseException {
		System.out.println("Enter employee Details");
		System.out.println("======================");
		System.out.print("Enter Employee Id: ");
		empId = sc.nextInt();
		System.out.print("Enter Employee Name: ");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.print("Enter Employee DoB in [dd/MM/yyyy] format: ");
		empDob = sc.next();
		dob = convertStringToDate(empDob);
		System.out.print("Enter Employee Doj in [dd/MM/yyyy] format: ");
		empDoj = sc.next();
		doj = convertStringToDate(empDoj);
		System.out.print("Enter Employee Salary: ");
		empSalary = sc.nextFloat();
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee Details are:");
		System.out.println("=========================");
		System.out.println("Employee Id: " + empId);
		System.out.println("=========================");
		System.out.println("Employee Name: " + empName);
		System.out.println("=========================");
		System.out.println("Employee DoB: " + empDob);
		System.out.println("=========================");
		System.out.println("Employee Id: " + empDoj);
		System.out.println("=========================");
		System.out.println("Employee Salary = " + empSalary);

	}

	// method to convert string to date
	public Date convertStringToDate(String date) throws ParseException {
		Date stringToDate = sdf.parse(date);
		return stringToDate;
	}

	public float showSalary() {
		return empSalary;
	}
}