package com.dl.testconnections;

public class TestDriver 
{

	public static void main(String[] args) 
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

	}
}
