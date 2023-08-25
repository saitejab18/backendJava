package com.dl.six;

interface B{
	default void m1() {
	   System.out.println("m1 method");	
	}
}

public class Eg2 implements B {
	
	public void m1() {
		System.out.println("M1 main method");
	}

	public static void main(String[] args) {

	 B b = new Eg2();
	 b.m1();
	 
	}
	

}
