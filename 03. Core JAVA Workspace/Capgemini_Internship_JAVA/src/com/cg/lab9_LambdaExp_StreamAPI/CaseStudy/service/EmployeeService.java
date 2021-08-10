package com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.repository.EmployeeRepository;

public class EmployeeService {

	// main method for program execution
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		BufferedReader sm_br = new BufferedReader(new InputStreamReader(System.in));
		EmployeeRepository empRep=new EmployeeRepository();
		int choice;
		char c='y';
		while(c!='n' && c!='N' && c!='0') {
			System.out.print("1. Add Employee\n2. Find out the sum of salary of all employees\n3. List out department names and count of employees in each department\n4. Find out the senior most employee of an organization.\n5. List employee name and duration of their service in months and days\n6. Find out employees without department\n7. Find out department without employees.\n8. Find departments with highest count of employees\n9. List employee name, hire date and day of week on which employee has started\n10. List employee name, hire date and day of week for employee started on Friday\n11. List employee’s names and name of manager to whom he/she reports\n12. List employee name, salary and salary increased by 15%\n13. Find employees who didn’t report to anyone\n14. Accept the first name and last name of manager to print name of all his/her subordinates\n15. Sort employees by their employee id, department id, first name\nEnter your choice : ");
			choice=sm.nextInt();
			switch(choice) {
			case 1 : empRep.createEmployee();
			break;
			case 2 : empRep.salarySum();
			break;
			case 3 : empRep.listDepartmentNameAndEmployeeCount();
			break;
			case 4 : empRep.findSeniorMostEmployee();
			break;
			case 5 : empRep.displayEmployeeServiceDuration();
			break;
			case 6 : empRep.employeeWithoutDept();
			break;
			case 7 : empRep.deptWithoutEmp();
			break;
			case 8 : empRep.departmentWithHighestCount();
			break;
			case 9 : empRep.employeeNameWithHireDate();
			break;
			case 10 : empRep.employeeNameWithHireDateFriday();
			break;
			case 11 : empRep.employeeWithManager();
			break;
			case 12 : empRep.salaryHike();
			break;
			case 13 : empRep.employeeWithoutManager();
			break;
			case 14 : String name;
			boolean result=false;
			String str_split[];
			do
			{
			System.out.print("\nEnter the manager name : ");
			name=sm_br.readLine();
			str_split=name.split(" ");
			if(str_split[0].length()==0) {
				System.out.println("\nFirst name cannot be blank.");
			}
			else if(str_split.length<2) {
				System.out.println("\nLast name cannot be blank.");
			}
			}while(str_split[0].length()==0 || str_split.length<2);
			empRep.employeeUnderManager(str_split[0], str_split[1]);
			break;
			case 15 : empRep.sortEmployees();
			break;
			default : System.out.println("\nEnter correct choice 1-15 only...\n");
			}
			System.out.print("Do you want to continue?(y/n) ");
			c=sm.next().trim().charAt(0);
			System.out.println();
		}
	}

}
