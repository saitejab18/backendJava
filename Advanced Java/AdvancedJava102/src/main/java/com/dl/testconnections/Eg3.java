package com.dl.testconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Eg3 {
	static Connection connection = null;
	static PreparedStatement statement = null;

	public static void main(String[] args) throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
			statement = connection.prepareStatement("insert into emp values(?,?,?,?)");
			
			statement.setInt(1, 106);
			statement.setString(2, "Saikumar");
			statement.setString(3, "Warangal");
			statement.setDouble(4, 3547857D);
			statement.addBatch();
			
			statement.setInt(1, 107);
			statement.setString(2, "SaiVamshi");
			statement.setString(3, "knr");
			statement.setDouble(4, 546657D);
			statement.addBatch();
			
			statement.executeBatch();
			
			System.out.println("Data inserted");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			statement.close();
			connection.close();
		}
		
	}

}
