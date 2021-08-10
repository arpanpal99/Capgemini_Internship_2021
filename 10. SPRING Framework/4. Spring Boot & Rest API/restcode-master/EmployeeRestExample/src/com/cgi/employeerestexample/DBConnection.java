package com.cgi.employeerestexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection con = null;
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/cgi","root","root"); 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con==null)
			System.out.println("connection not found");
		return con;
	}	
}
