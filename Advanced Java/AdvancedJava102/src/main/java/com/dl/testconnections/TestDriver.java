package com.dl.testconnections;

import java.sql.DriverManager;
import java.sql.SQLException;



public class TestDriver 
{

	public static void main(String[] args) throws SQLException
	{
       try 
        {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Connected");
		
	    } 
       catch (ClassNotFoundException e)
       
        {
		System.out.println("Driver not Found");
       
	    }
       try {
		
		
       DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc101","root","root");
       Class.forName("com.mysql.cj.jdbc.Driver");
       System.out.println("Database connected");
       }
       
       catch (ClassNotFoundException e){
    	   System.out.println("Database not found");
    	   
       }

	}
}
