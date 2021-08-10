package com.capgemini.practice.Day10.DataBaseManagement;

import java.util.Scanner;

public class Employee_MainClass {

	public static void main(String[] args) {
		// Declaring an array of Employee objects and allocating 3 memory blocks
		// But this declaration doesn't create any object
		Employee[] empList = new Employee[3];
		// Creating Objects:
		empList[0] = new Employee(1001, "Mark");
		empList[1] = new Employee(1002, "Tony");
		empList[2] = new Employee(1003, "Angela");
		// Display Employee Details:
		empList[0].displayEmpDetails();
		empList[1].displayEmpDetails();
		empList[2].displayEmpDetails();

		Employee emp = new Employee();
		Employee[] empList1 = new Employee[3];
		Scanner sc = new Scanner(System.in);
		empList1 = emp.createEmpList();

		// displayEmpDetails with employee[] object as argument is called
		System.out.println("Output from displayEmpDetails with employee[] object as argument ");
		emp.displayEmpDetails(empList1);

		Employee emp2 = new Employee();
		emp2.setEmpID(120005);
		emp2.setEmpName("Ramji");
		System.out.println("Output from displayEmpDetails with employee object as argument ");
		// displayEmpDetails with employee object as argument is called
		emp.displayEmpDetails(emp2);

		// call find by employee by id
		System.out.println("Enter the empid to find an employee");
		int id = sc.nextInt();
		emp.findEmployeeById(empList1, id);

		// call update by employee by id
		System.out.println("Enter the empid to update an employee details");
		int eid = sc.nextInt();
		emp.updateEmployeeById(empList1, eid);

		// call delete by employee by id
		System.out.println("Enter the empid to delete an employee details");
		int did = sc.nextInt();
		emp.deleteEmployeeById(empList1, did);

	}

}
