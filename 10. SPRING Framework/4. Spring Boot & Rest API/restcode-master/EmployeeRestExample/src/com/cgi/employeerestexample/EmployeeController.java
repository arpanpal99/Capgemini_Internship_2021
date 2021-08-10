package com.cgi.employeerestexample;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;

@Path("/employee")
public class EmployeeController {
	
	EmployeeService empService = new EmployeeService();
	
    @GET
    @Path("/get/{empId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("empId")int id) {
    	return empService.getEmployee(id);
    }

    @PUT
    @Path("/updateemployee")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateEmployee(@QueryParam("empid")int id,Employee emp) {
    	int updated = empService.updateEmployee(id,emp);
    	if(updated!= 0) {
    		return "employee updated successfully";
    	}else {
    		return "employee not updated successfully";
    	}
    }
    
    @GET
    @Path("/getemplist")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getEmployeeList() {
    	return empService.getEmployeeList();
    }
    
    @POST
    @Path("/addemployee")
    @Consumes(MediaType.APPLICATION_JSON)
    public String postEmployee(Employee employee) {
    	int result = empService.postEmployee(employee);
    	if(result>0) {
    		return "employee added successfully";
    	}else {
    		return "employee not added successfully";
    	}
    }
    
    @DELETE
    @Path("/delete")
    public String deleteEmployee(@MatrixParam("empid")int id) {
    	int result = empService.deleteEmployee(id);
    	if(result>0) {
    		return "employee deleted successfully";
    	}else {
    		return "employee not deleted successfully";
    	}
    }
    
    @PUT
    @Path("/updateemployee/{empid}")
    @Consumes(MediaType.APPLICATION_JSON)
    public String updateEmployee(@PathParam("empid")int id,
    		@MatrixParam("ename")String ename,@MatrixParam("ecity")String ecity) {
    	int updated = empService.updateEmployee(id,ename,ecity);
    	if(updated!= 0) {
    		return "employee updated successfully";
    	}else {
    		return "employee not updated successfully";
    	}
    }
    
    @POST
    @Path("/postemployee")
    public String postEmployee(@FormParam("empId")int empId,
    		@FormParam("empName")String empName,@FormParam("empCity")String empCity) {
    	int result = empService.postEmployee(empId,empName,empCity);
    	if(result>0) {
    		return "employee added successfully";
    	}else {
    		return "employee not added successfully";
    	}
    }
    
    @GET
    @Path("/getuseragent")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response getUserAgent(@HeaderParam("user-agent")String uagent) {
    	return Response.status(200).entity("addEmployee is called,user-agent : " +uagent).build();
    }
    
    @GET
    @Path("/getheaders")
    //@Produces(MediaType.APPLICATION_JSON)
    public Response getHeaders(@Context HttpHeaders headers) {
    	String userAgent = headers.getRequestHeader("user-agent").get(0);
    	return Response.status(200).entity("Requested from : " +userAgent).build();
    }
}
