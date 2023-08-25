package com.dl.five;

public class Eg4 {

	public static void main(String[] args) {

		Thread t = new Thread(() ->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread");
			}
		});
		t.start();
	}

}
