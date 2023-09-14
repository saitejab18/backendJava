package com.dl.innerbean.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/innerbean/setterinjection/applicationContext.xml");
		Honda honda = (Honda) context.getBean("id1");
		context.close();
		System.out.println(honda);
	}

}
