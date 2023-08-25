package com.dl.onw;

@FunctionalInterface

interface Properties{
	void add(int a, int b);
}


public class Eg1 implements Properties {

	public static void main(String[] args) {
		
		Eg1 eg = new Eg1(); // Inheritance
		eg.add(10, 20);
		
		Properties p = new Eg1(); // Polymorphism
		p.add(10,20);

	}

	@Override
	public void add(int a, int b) {
           System.out.println(a+b);		
	}

}
