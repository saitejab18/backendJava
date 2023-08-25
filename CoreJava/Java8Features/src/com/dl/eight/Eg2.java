package com.dl.eight;

public class Eg2 {
	public static void m1() {
		int a= 10;
		int b =20;
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		
		m1();
		Eg2.m1();

		Thread t = new Thread(Eg2::m1);
		t.start();
		
		Thread t1 = new Thread(() -> m1());
		t1.start();
	}

}
