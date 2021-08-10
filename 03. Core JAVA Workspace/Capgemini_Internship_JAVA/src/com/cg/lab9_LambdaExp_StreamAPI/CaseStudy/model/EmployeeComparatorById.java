package com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model;

import java.util.Comparator;

public class EmployeeComparatorById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getEmployeeId()>e2.getEmployeeId())
			return 1;
		else if(e1.getEmployeeId()==e2.getEmployeeId())
			return 0;
		return -1;
	}

}
