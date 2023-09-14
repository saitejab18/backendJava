package com.dl.valueasattribute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/valueasattribute/applicationContext.xml");
	Location loc = (Location)context.getBean("id1");
	System.out.println(loc);
	context.close();
	}
	

}
