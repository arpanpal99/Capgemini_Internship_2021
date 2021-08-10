package com.capgemini.assignment.Day07a;

import java.util.Scanner;

public class MainClass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("1. New admin personnel\n2. New academic personnel\nEnter your choice (1 or 2): ");
		int choice = sc.nextInt();
		while (choice == 1 || choice == 2) {
			if (choice == 1)
				newAdmin();
			else if (choice == 2)
				newAcademic();
			else
				System.out.print("************************************\n"
						+ "1. New admin personnel\n2. New academic personnel\n" + "Enter correct choice (1 or 2): ");
			System.out.print("Press 0 to exit.\nOr, enter your choice to add more personnel: ");
			choice = sc.nextInt();
			if (choice == 0)
				System.out.println("-------------------------------------------------\nFarewell. Have a great day!");
		}
		sc.close();
	}

	private static void newAdmin() {

		Admin adminPersonnel = new Admin();

		System.out.print("Enter the name of Admin: ");
		String adminName = sc.next();
		adminPersonnel.setName(adminName);
		System.out.print("Enter salary of " + adminName + ": $");
		double adminSal = sc.nextDouble();
		adminPersonnel.setSalary(adminSal);

		System.out.print("Do you want to adjust salary? y/n? ");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.print("Enter percentage increase of Admin Salary: ");
			double chngSal = sc.nextDouble();
			adminPersonnel.adjustSalary(chngSal);
		} else
			adminPersonnel.adjustSalary(0);

		adminPersonnel.doAdminStuff();
	}

	private static void newAcademic() {

		Academic academicPersonnel = new Academic();
		System.out.print("Enter the name of Academic Personnel: ");
		String academicName = sc.next();
		academicPersonnel.setName(academicName);
		System.out.print("Enter salary of " + academicName + ": $");
		double academicSal = sc.nextDouble();
		academicPersonnel.setSalary(academicSal);

		System.out.print("Do you want to adjust salary? y/n? ");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.print("Enter percentage increase of Academic Personnel Salary: ");
			double chngSal = sc.nextDouble();
			academicPersonnel.adjustSalary(chngSal);
		} else
			academicPersonnel.adjustSalary(0);

		academicPersonnel.giveLecture();
	}

}
