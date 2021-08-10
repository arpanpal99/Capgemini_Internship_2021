package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

interface EmployeeService {

	void setEmployeeDetails();

	void getEmployeeDetails(Employee e);

	void acceptInsuranceAndDisplay();

	void displayAll();
	
	void updateEmployee();

	void deleteEmployee();
}

public class EmployeeManager extends Employee implements EmployeeService {

	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Employee> hMap = new HashMap<Integer, Employee>();

	public static void invokeCRUD() {

		int choice = 1;
		EmployeeManager em = new EmployeeManager();
		while (choice != 0) {

			System.out.println("**************************************************");
			System.out.print(
					"1. CREATE Employee\n2. Show employess of a particular scheme (term/life/unit)"
					+ "\n3. Display all employees\n4. UPDATE Employee\n"
					+ "5. DELETE Employee\n0. EXIT\nEnter your choice: ");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				em.setEmployeeDetails();
				break;
			case 2:
				em.acceptInsuranceAndDisplay();
				break;
			case 3:
				em.displayAll();
				break;
			case 4:
				em.updateEmployee();
				break;
			case 5:
				em.deleteEmployee();
				break;
			case 0:
				System.out.println("**************************************************\nExiting...");
				break;
			default:
				System.out.println("Wrong Choice..!");
				break;

			}

		}

	}

	@Override
	public void displayAll() {
		System.out.println("Showing insurance scheme details of all type: ");
		for (Entry<Integer, Employee> m : hMap.entrySet()) {
			new EmployeeManager().getEmployeeDetails(m.getValue());	
		}
	}

	@Override
	public void setEmployeeDetails() {

//		Employee e = new Employee();
//		System.out.print("Enter the Employee id: ");
//		e.setId(sc.nextInt());
//		System.out.print("Enter the Employee name: ");
//		e.setName(sc.next());
//		System.out.print("Enter the Employee salary: ");
//		e.setSalary(sc.nextInt());
//		System.out.print("Enter the Employee designation: ");
//		e.setDesignation(sc.next());
//		System.out.print("Enter the Insurance Scheme: ");
//		e.setInsuranceScheme(sc.next());
//		hMap.put(e.getId(), e);
		hMap.put(1001, new Employee(1001, "Mark", 6589, "Manager", "term"));
		hMap.put(1002, new Employee(1002, "Tommy", 3240, "Developer", "term"));
		hMap.put(1003, new Employee(1003, "Angela", 1025, "Manager", "life"));
		hMap.put(1009, new Employee(1009, "Joseph", 5259, "Associate", "term"));
		hMap.put(1011, new Employee(1011, "Robert", 6651, "Developer", "unit"));
		System.out.println("5 employees have been created automatically");
	}

	@Override
	public void acceptInsuranceAndDisplay() {
		System.out.print("Enter Insurance Scheme type (term/life/unit): "); String in = sc.next();
		System.out.println("Showing insurance scheme details of type " + in + ": ");
		for (Entry<Integer, Employee> m : hMap.entrySet()) {
			if (m.getValue().getInsuranceScheme().equalsIgnoreCase(in)) {
				new EmployeeManager().getEmployeeDetails(m.getValue());
			}
		}
	}

	@Override
	public void updateEmployee() {

		System.out.print("Enter the id of the employee you want to update: ");
		int id = sc.nextInt();
		Employee e = new Employee();
		for (Entry<Integer, Employee> m : hMap.entrySet())
			if (m.getValue().getId() == id) {
				e.setId(id);
				System.out.print("Enter the Employee name: ");
				e.setName(sc.next());
				System.out.print("Enter the Employee salary: ");
				e.setSalary(sc.nextInt());
				System.out.print("Enter the Employee designation: ");
				e.setDesignation(sc.next());
				System.out.print("Enter the Insurance Scheme: ");
				e.setInsuranceScheme(sc.next());
				hMap.put(e.getId(), e);
				break;
			}
		System.out.println("Employee with ID: " + id + " has been updated in the database.");
	}
	
	@Override
	public void deleteEmployee() {

		System.out.print("Enter the id of the employee you want to delete: ");
		int id = sc.nextInt();
		for (Entry<Integer, Employee> m : hMap.entrySet())
			if (m.getValue().getId() == id) {
				hMap.remove(m.getKey());
				break;
			}
		System.out.println("Employee with ID: " + id + " has been removed from the database.");
	}

	@Override
	public void getEmployeeDetails(Employee e) {
		System.out.println("---------------------------------");
		System.out.println("Employee id: " + e.getId());
		System.out.println("Employee name: " + e.getName());
		
		System.out.println("Employee salary: " + e.getSalary()+(e.getSalary() == 0 ? " (Update salary to more than 3000)" : e.getSalary()));
		System.out.println("Employee designation: " + e.getDesignation());
		System.out.println("Employee insurance scheme: " + e.getInsuranceScheme());
		System.out.println("---------------------------------");
	}

}