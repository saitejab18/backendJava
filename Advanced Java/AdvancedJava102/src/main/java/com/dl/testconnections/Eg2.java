package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg2 {
	static Connection connection = null;
	static Statement statement = null;

	public static void main(String[] args) throws SQLException   
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
			statement = connection.createStatement();
			
			String s1 = "insert into emp values(101,'Rahul','Hyderabad','30000')";
			String s2 = "insert into emp values(102,'Saiteja','Jagtial','40000')";
			String s3 = "insert into emp values(103,'Pranay','Kamareddy','50000')";
			String s4 = "insert into emp values(104,'Chintu','Hyderabad','60000')";
			String s5 = "insert into emp values(105,'Rajeev','Bhonagir','80000')";
			
			statement.addBatch(s1);
			statement.addBatch(s2);
			statement.addBatch(s3);
			statement.addBatch(s4);
			statement.addBatch(s5);
			
			int[] executeBatch = statement.executeBatch();
			for (int i : executeBatch) {
				System.out.println(i);
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
