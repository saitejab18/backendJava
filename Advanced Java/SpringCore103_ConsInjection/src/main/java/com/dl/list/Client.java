package com.dl.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{ 
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/dl/list/app.xml");
        Stu_data d = (Stu_data) context.getBean("id1");
        System.out.println(d);
        context.close();
	}

}
