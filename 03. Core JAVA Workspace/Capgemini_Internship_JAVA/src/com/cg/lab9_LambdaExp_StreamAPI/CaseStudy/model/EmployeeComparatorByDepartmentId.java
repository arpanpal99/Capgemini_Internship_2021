package com.cg.lab9_LambdaExp_StreamAPI.CaseStudy.model;

import java.util.Comparator;

public class EmployeeComparatorByDepartmentId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getDepartment().getDepartmentId()>e2.getDepartment().getDepartmentId())
			return 1;
		else if(e1.getDepartment().getDepartmentId()==e2.getDepartment().getDepartmentId())
			return 0;
		return -1;
	}

}
