package com.cgi.employeerestexample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("xml/employee")
public class EmployeeXMLController {

	@GET
	@Path("/getemployeeinxml")
	public Employee getEmployeeinXML(){
		Employee emp = new Employee();
		emp.setEmpId(345);
		emp.setEmpName("rama");
		emp.setEmpCity("Chennai");
		
		return emp;
	}
}
