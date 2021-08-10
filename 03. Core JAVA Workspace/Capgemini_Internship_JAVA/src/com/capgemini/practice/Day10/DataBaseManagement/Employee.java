package com.capgemini.practice.Day10.DataBaseManagement;

import java.util.Scanner;

public class Employee {

	public Employee() {
		super();
	}

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	private int empID;
	private String empName;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void displayEmpDetails() {
		System.out.println("Employee ID: " + empID);
		System.out.println("Employee Name: " + empName + "\n");
	}

	// displayEmpDetails with Employee Object as argument
	public void displayEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("empId = " + emp.getEmpID() + "Emp name = " + emp.getEmpName());
		System.out.println();
	}

	// overloaded the method displayEmpDetails by Employee[] object as argument
	public void displayEmpDetails(Employee[] emp) {
		for (int i = 0; i < emp.length; i++) {
			System.out.println("empId = " + emp[i].getEmpID() + "Emp name = " + emp[i].getEmpName());
			System.out.println();
		}
	}

	// find an employee by id
	public void findEmployeeById(Employee[] emp, int id) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmpID() == id) {
				System.out.println("employee found at " + i);
				System.out.println("empId = " + emp[i].getEmpID() + "Emp name = " + emp[i].getEmpName());
				break;
			} else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}

	// creating the list of employees using array and returning an array
	Scanner sc = new Scanner(System.in);
	Employee[] empList1 = new Employee[3];

	public Employee[] createEmpList() {
		for (int i = 0; i < empList1.length; i++) {
			System.out.println("Enter the employee details for  " + i + " emp object");
			empList1[i] = new Employee();
			empList1[i].setEmpID(sc.nextInt());
			empList1[i].setEmpName(sc.next());
		}
		return empList1;
	}

	// find an employee by id
	public void updateEmployeeById(Employee[] emp, int id) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmpID() == id) {
				System.out.println("employee found at " + i);
				System.out.println("Enter new name to update for the employee");
				String updatedname = sc.next();
				emp[i].setEmpName(updatedname);
				System.out.println("empId = " + emp[i].getEmpID() + "Emp name = " + emp[i].getEmpName());
				break;
			} else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}

	// delete an employee by id
	public Employee[] deleteEmployeeById(Employee[] emp, int id) {
		int originalLength = emp.length;
		for (int i = 0; i < originalLength; i++) {
			if (emp[i].getEmpID() == id) {
				System.out.println("employee found at " + i);
				emp[i] = emp[originalLength - 1];
				originalLength--;
				break;
			} else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
		return emp;
	}
}
