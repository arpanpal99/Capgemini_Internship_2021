package com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model;

import java.util.Comparator;

public class EmployeeComparatorByFirstName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getFirstName().compareTo(e2.getFirstName());
	}

}
