package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg4 {
	static Connection connection = null;
	
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
			
			Statement createstatement = connection.createStatement();
			String s1 = "Select * from emp";
			
			ResultSet executeQuery = createstatement.executeQuery(s1);
			while(executeQuery.next()) {
				System.out.println(executeQuery.getInt(1));
				System.out.println(executeQuery.getString(2));
				System.out.println(executeQuery.getString(3));
				System.out.println(executeQuery.getLong(4));
				
				System.out.println();
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
