package com.dl.five;
class A implements Runnable{

	@Override
	public void run() {
          for (int i = 1; i < 5; i++) {
			 System.out.println("Run method of A");
		}		
	}
	
}

public class Eg1 {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a);
		
	for (int i = 1; i < 5; i++) {
		System.out.println("Run method() Eg1");
		
	}
       t.start();
	}

}
