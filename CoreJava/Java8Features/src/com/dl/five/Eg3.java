package com.dl.five;

public class Eg3 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Main Thread");
				}
				
			}
		});
		t.start();
	}
	

}
