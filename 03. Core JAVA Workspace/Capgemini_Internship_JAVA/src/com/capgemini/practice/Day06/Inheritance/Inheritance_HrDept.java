package com.capgemini.practice.Day06.Inheritance;

public class Inheritance_HrDept extends Inheritance_Employee {

	private int noOfWorkingDays = 30;
	private int noOfLeaveDays;

	public void readLeaveDays() {
		System.out.println("Enter number of leave days: ");
		noOfLeaveDays = sc.nextInt();
	}

	public int showLeaveDays() {
		System.out.println("Number of leave days: " + noOfLeaveDays);
		return noOfLeaveDays;
	}

	public void readWorkingDays() {
		System.out.println("Enter number of working days: ");
		noOfWorkingDays = sc.nextInt();
	}

	public int showWorkingDays() {
		System.out.println("Number of working days: " + noOfWorkingDays);
		return noOfWorkingDays;
	}
}