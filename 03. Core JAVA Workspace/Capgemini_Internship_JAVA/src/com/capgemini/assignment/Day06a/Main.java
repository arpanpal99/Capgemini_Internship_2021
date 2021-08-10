package com.capgemini.assignment.Day06a;

import java.util.Scanner;

public class Main {

	static void studentDetails() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.print("Enter student's name: ");
		String name = sc.nextLine();
		student.setName(name);
		System.out.print("Enter student's address: ");
		String address = sc.nextLine();
		student.setAddress(address);
		System.out.print("Enter student's year: ");
		int year = sc.nextInt();
		student.setYear(year);
		System.out.print("Enter student's program: ");
		String program = sc.next();
		student.setProgram(program);
		sc.nextLine();
		System.out.print("Enter student's fee: ");
		double fee = sc.nextDouble();
		student.setFee(fee);
		sc.nextLine();
		System.out.println("The details are: ");
		System.out.println(student.toString());
		sc.close();
	}

	static void staffDetails() {
		Scanner sc = new Scanner(System.in);
		Staff staff = new Staff();
		System.out.print("Enter staff name: ");
		String name = sc.nextLine();
		staff.setName(name);
		System.out.print("Enter staff address: ");
		String address = sc.nextLine();
		staff.setAddress(address);
		System.out.print("Enter staff school: ");
		String school = sc.nextLine();
		staff.setSchool(school);
		System.out.print("Enter the pay: ");
		double pay = sc.nextDouble();
		staff.setPay(pay);
		System.out.println("The details are: ");
		System.out.println(staff.toString());

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice: \n1. Student details\n2. Staff details\n");
		int ch = sc.nextInt();
		if (ch == 1)
			studentDetails();
		else if (ch == 2)
			staffDetails();
		else
			System.out.println("Wait what!?");
	}
}
