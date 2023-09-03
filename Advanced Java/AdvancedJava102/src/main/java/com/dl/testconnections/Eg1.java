package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Eg1 {
	static Connection connection = null;
	static Statement statement = null;

	public static void main(String[] args) throws SQLException
	{
		try
		{
			
    // Step 1- Load the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	// Step-2 Get Connections
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
    
	// Step-3 Create statement object
	 statement = connection.createStatement();
	
	//Step-4 Creating a table
//String create = "create table emp(e_id int,e_name varchar(40),e_address varchar(255),e_salary double)";
	 String insert = "insert into emp values(204,'Rahul','Hyderabad','30000')";
	statement.executeUpdate(insert);
	System.out.println("Data inserted");
	
		}
		       
		catch (ClassNotFoundException e){
		  System.out.println(e);
		    	   
		       }finally {
		    	   connection.close();
		    	   statement.close();
		    	   
		       }
	}

}
