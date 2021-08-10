package com.capgemini.practice.Day06.Inheritance;

public class Inheritance_AccountsDept extends Inheritance_HrDept {

	int noOfSalaryDays;

	public void calculateSalary() {
		noOfSalaryDays = showWorkingDays() - showLeaveDays();
		float sal = showSalary();
		float salPerDay = sal / 30;
		float totalSalPerMonth = salPerDay * noOfSalaryDays;
		System.out.println("Salary credited = " + totalSalPerMonth);
	}

}
