package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultSets {

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
		
		// execute the queries 
		
		String selectquery = "select * from persons;";
		
		// pass the selectquery to result set
		
		ResultSet rs = st.executeQuery(selectquery);
		
		// result set In JDBC (Java Database Connectivity), a ResultSet is an object that represents the result of a database query
		
		while (rs.next()) {
			
		 // Basic syntax for the result set 
			
			// fetch PersonID
			
			int id = rs.getInt("PersonID");
			
			System.out.println(id);
			
			// fetch FirstName 
			
			String Firstname = rs.getString("FirstName");
			
			System.out.println(Firstname);
			
			// use can also use column indexing 
			
			int id1 = rs.getInt(1);
			
			System.out.println(id1);
			
			String  s = rs.getString(2);
			
			System.out.println(s);
			
			
			// print all the data 
			
		}
		
		
	}

}
