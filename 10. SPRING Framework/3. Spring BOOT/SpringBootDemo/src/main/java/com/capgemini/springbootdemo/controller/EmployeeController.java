package com.capgemini.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootdemo.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	List<Employee> empList = new ArrayList<Employee>();
	
	@RequestMapping("/showemployee")
	public Employee showEmployee() {
		Employee emp = new Employee(123, "Rama");
		return emp;
	}
	
	@RequestMapping("/showemployees")
	public List<Employee> listofEmployees() {
		Employee emp = new Employee(123, "Rama");
		Employee emp1 = new Employee(124, "Rama");
		Employee emp2 = new Employee(125, "Rama");
		
		empList.add(emp2);
		empList.add(emp1);
		empList.add(emp);
		return empList;
	}
	
	@RequestMapping("/showemployeebyid/{id}")
	public Employee showEmployeeById(@PathVariable("id") int employeeid) {
		Employee emp = new Employee(123, "Rama");
		Employee emp1 = new Employee(124, "Rama");
		Employee emp2 = new Employee(125, "Rama");
		
		empList.add(emp2);
		empList.add(emp1);
		empList.add(emp);
		
		System.out.println("Searching employee by id"+ employeeid);
		Employee emp11 = new Employee();
		for(int i=0;i<empList.size();i++) {
			System.out.println("in employee by id for loop");
			if(empList.get(i).getEid() == employeeid)
			{
				System.out.println("in employee by id if loop");
				emp11 = empList.get(i);
				System.out.println(emp11.getEid());
			}
		}
		return emp11;
		
	}

}
