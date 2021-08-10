package jdbc_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) throws Exception {
		
		try {
			//Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("\"ojdbc8.jar\" Driver loaded\n");
			
			//Establish the connection
			System.out.println("Connecting to Oracle database...\n");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1425*5241#aA");
			System.out.println("Connection to Oracle Database established\n");
			
			//-------------------------------------------------------------------------------------------------------------------------------
			
			// TODO SQL Queries
			//Create the statement
			Statement stmt = con.createStatement();
			
			//Execute the SQL Statement or Query
			ResultSet rs = stmt.executeQuery("select * from BOOKS");
			
			System.out.println("Book ID\t\tBook NAME");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
			}
			
			//-------------------------------------------------------------------------------------------------------------------------------
			
			//Closing the connection
			System.out.println("\nClosing the connection");
			con.close();
		}
		catch (ClassNotFoundException cle) {
			System.out.println("\"ojdbc8.jar\" failed to load\n");
		}
		catch (SQLException sqe) {
			System.out.println("SQL Exception\n");
			System.out.println(sqe);
		}
		
		
		
		
	}
}