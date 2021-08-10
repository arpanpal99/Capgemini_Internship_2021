package com.cgi.employeerestexample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	ArrayList<Employee> empList = new ArrayList<Employee>();
	EmployeeDao empDao = new EmployeeDao();
	
    public Employee getEmployee(int empId) {
   
    	return empDao.getEmployee(empId);
    	
    }
    
    public int postEmployee(Employee employee) {
    	return empDao.postEmployee(employee);
    }
    
    public ArrayList<Employee> getEmployeeList() {
    	return empDao.getEmployeeList();
    }

	public int updateEmployee(int id,Employee emp) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(id,emp);
	}

	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return empDao.deleteEmployee(id);
	}

	public int updateEmployee(int id, String ename, String ecity) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(id,ename,ecity);
	}

	public int postEmployee(int empId, String empName, String empCity) {
		// TODO Auto-generated method stub
		return empDao.postEmployee(empId,empName,empCity);
	}

}
