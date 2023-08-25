package com.dl.five;

public class Eg2 {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 1; i < 5; i++) {
				System.out.println("Run method()");
			}
		};             // Anonymous Function
		Thread t = new Thread(r);
		t.start();
	}
	

}
