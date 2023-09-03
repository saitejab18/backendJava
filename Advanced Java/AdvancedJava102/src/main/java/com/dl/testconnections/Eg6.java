package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg6 {
	static Connection connection = null;
	

	public static void main(String[] args) throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
			
			DatabaseMetaData metadata  =connection.getMetaData();
			System.out.println(metadata.getDriverName());
			System.out.println(metadata.getDriverVersion());
			System.out.println(metadata.getUserName());
			System.out.println(metadata.getDatabaseProductName());
			System.out.println(metadata.getDatabaseProductVersion());
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
