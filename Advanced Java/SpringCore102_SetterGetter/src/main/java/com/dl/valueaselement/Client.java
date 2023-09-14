package com.dl.valueaselement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/valueaselement/applicationContext.xml");
		Honda honda = (Honda)context.getBean("id1");
		System.out.println(honda.getVno());
		System.out.println(honda.getVname());
		context.close();
	}
}