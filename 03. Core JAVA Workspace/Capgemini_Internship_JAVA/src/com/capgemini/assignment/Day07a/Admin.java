package com.capgemini.assignment.Day07a;

public class Admin extends Payroll {

	Admin() {
		// default constructor
		System.out.println("\n\n************************************"
				+ "\nWelcome to Admin panel\n************************************");
	}

	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double sal) {
		this.salary = sal;
	}

	public double adjustSalary(double inc) {

		System.out.println("------------------------------------------------.");
		System.out.println("* Admin Name: " + getName() + "\t\t\t\t|");
		System.out.println(
				String.format("* Present salary of " + getName() + ": $%.2f\t\t|", (getSalary() * (1 + inc / 100))));
		return getSalary() * (1 + inc / 100);

	}

	public void doAdminStuff() {
		System.out.println("* Admin's Notice:\t\t\t\t|\n* \"Classes should commence everyday from 8.30AM\"|");
		System.out.println("------------------------------------------------'");
	}

}
