package com.cg.eis.exception;

import java.util.Scanner;

public class MainClass {
	public static void validate(double salary) throws EmployeeException {
		if (salary < 3000)
			throw new EmployeeException("\nException Cause: Salary is less than 3000!");
		else
			System.out.println("Valid salary!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee salary: ");
		int sal = sc.nextInt();
		try {
			validate(sal);
		} catch (Exception e) {
			System.out.println("\nException occurred! " + e);
			System.out.println("----------------------");
		}
		sc.close();
	}
}
