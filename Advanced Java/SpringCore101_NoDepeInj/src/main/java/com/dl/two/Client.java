package com.dl.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Brand{
	public String Honda();
}

class Bike implements Brand{
	public String Honda() {
		return "Honda CBR!!";
	}
}

class Car implements Brand{
	public String Honda() {
		return "Honda City";
	}
}

public class Client {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Brand b1 = context.getBean("id1", Brand.class); //Brand b1 = new Bike();
		Brand b2 = context.getBean("id2", Brand.class); //Brand b2 = new Car();
		
		System.out.println(b1.Honda());
		System.out.println(b2.Honda());
		System.out.println("Hello world");
		
		context.close();
	}
}