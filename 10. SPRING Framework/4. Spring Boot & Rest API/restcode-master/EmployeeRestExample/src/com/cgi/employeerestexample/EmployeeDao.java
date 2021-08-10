package com.cgi.employeerestexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {

	public static PreparedStatement pstmt;
	public static Statement stmt;
	public static ResultSet rs;
	public int res;
	public String getEmpList;
	public static Connection con;
	public Employee emp;
	ArrayList<Employee> empList = new ArrayList<Employee>();

	static {
		con = DBConnection.getDBConnection();
	}

	public Employee getEmployee(int empId) {
		String getEmp = "select * from employee where empid = "+empId;
		Employee emp1 = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(getEmp);
			while (rs.next()) {
				emp1 = new Employee();
				emp1.setEmpId(rs.getInt(1));
				emp1.setEmpName(rs.getString(2));
				emp1.setEmpCity(rs.getString(3));
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		return emp1;
	}

	public int postEmployee(Employee employee) {

		String addEmp = "insert into employee values(?,?,?)";
		//Employee emp1 = null;
		int res=0;
		try {
			pstmt = con.prepareStatement(addEmp);
			pstmt.setInt(1, employee.getEmpId());
			pstmt.setString(2, employee.getEmpName());
			pstmt.setString(3, employee.getEmpCity());
			res = pstmt.executeUpdate();

		}catch(Exception e) {
				e.printStackTrace();
			}
		return res;
	}

	public ArrayList<Employee> getEmployeeList() {

		getEmpList = "select * from employee";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(getEmpList);
			while (rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpCity(rs.getString(3));
				empList.add(emp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	public int updateEmployee(int id,Employee emp) {
		// TODO Auto-generated method stub
		String updateEmp = "update employee set empid = ?,empname=?,empcity=? where empid = ?";
		//Employee emp1 = null;
		int res=0;
		try {
			pstmt = con.prepareStatement(updateEmp);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getEmpCity());
			pstmt.setInt(4, id);
			res = pstmt.executeUpdate();

		}catch(Exception e) {
				e.printStackTrace();
			}
		return res;
	}

	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String deleteEmp = "delete from employee where empid = "+id;
		int res = 0;
		try {
			stmt = con.createStatement();
			res = stmt.executeUpdate(deleteEmp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public int updateEmployee(int id, String ename, String ecity) {
		// TODO Auto-generated method stub
		String updateEmp = "update employee set empid = ?,empname=?,empcity=? where empid = ?";
		//Employee emp1 = null;
		int res=0;
		try {
			pstmt = con.prepareStatement(updateEmp);
			pstmt.setInt(1, id);
			pstmt.setString(2,ename);
			pstmt.setString(3, ecity);
			pstmt.setInt(4, id);
			res = pstmt.executeUpdate();

		}catch(Exception e) {
				e.printStackTrace();
			}
		return res;
	}

	public int postEmployee(int empId, String empName, String empCity) {
		// TODO Auto-generated method stub
		String addEmp = "insert into employee values(?,?,?)";
		//Employee emp1 = null;
		int res=0;
		try {
			pstmt = con.prepareStatement(addEmp);
			pstmt.setInt(1, empId);
			pstmt.setString(2,empName);
			pstmt.setString(3, empCity);
			res = pstmt.executeUpdate();

		}catch(Exception e) {
				e.printStackTrace();
			}
		return res;
	}

}
