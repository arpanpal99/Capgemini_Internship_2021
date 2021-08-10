package com.capgemini.practice.Day06.Inheritance;

import java.text.ParseException;

public class Inheritance_MainClass {

	public static void main(String[] args) throws ParseException {

		Inheritance_Employee emp = new Inheritance_Employee();
		emp.addEmployee();
		emp.displayEmployeeDetails();

		Inheritance_HrDept hrd = new Inheritance_HrDept();
		hrd.addEmployee();
		hrd.displayEmployeeDetails();
		hrd.readLeaveDays();
		hrd.showLeaveDays();

	}

}