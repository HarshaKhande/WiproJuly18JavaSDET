package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {



		// fetch the db url , password and username of the my sql db 
		
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		
		String username = "root";
		
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		// load the my sql driver file 
		
		// The line Class.forName("com.mysql.cj.jdbc.Driver"); in Java is used to explicitly load and register the MySQL JDBC driver within your Java application.
		
		// create a connection to the data base - connecting the database to java application
			
		// In JDBC (Java Database Connectivity), a Connection represents an active session between a Java application and a specific database
	
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		// create the statement object 
		
		//In JDBC (Java Database Connectivity), a Statement object is an interface used to execute SQL statements against a relational database. It serves as a fundamental component for interacting with databases from Java applications.

		
		Statement st = con.createStatement();
		
		// execute the select with one  parameter  
		
		String query  = "select * from Persons WHERE FirstName = ? ";
		
		PreparedStatement ps = con.prepareStatement(query);
		
	//	ps.setString(1,"Ravi");
		ps.setString(1,"Ramya");
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
	
			
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getString("LastName"));
			
		}
		
		
		// execute the select with two parameter  
		
		// hard coded query 
		String query1 = "select * from Persons where FirstName= 'Ravi'  and PersonId = '5667'";
		
		String query2 = "select * from Persons where FirstName = ? and PersonId = ?";
		
		PreparedStatement ps1 = con.prepareStatement(query2);
		
		// set the parameters 
		
		ps1.setString(1,"Ravi");
		ps1.setInt(2,5667);
		
		ResultSet rs1 = ps1.executeQuery();
		
		while (rs1.next()) {
	
			
			System.out.println(rs1.getString("Address"));
			System.out.println(rs1.getString("LastName"));
			System.out.println(rs1.getString("City"));
			
		}
		
	}

}
