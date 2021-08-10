package com.capgemini.assignment.Day07a;

public class Academic extends Payroll {

	Academic() {
		// default constructor
		System.out.println("\n\n************************************"
				+ "\nWelcome to Academic panel\n************************************");
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double adjustSalary(double inc) {

		System.out.println("------------------------------------------------.");
		System.out.println("* Academic Personnel's Name: " + getName() + "\t\t|");
		System.out.println(
				String.format("* Present salary of " + getName() + ": $%.2f\t\t|", (getSalary() * (1 + inc / 100))));
		return getSalary() * (1 + inc / 100);

	}

	public void giveLecture() {
		System.out.println("* Admin's Notice:\t\t\t\t|\n* \"Lecture will be starting from 8:30AM\"\t|");
		System.out.println("------------------------------------------------'");
	}

}
