package com.dl.four;

interface Login{
	void login();
}

public class Eg1 {

	public static void main(String[] args) {
		Login l = new Login() {

			@Override
			public void login() {
 				System.out.println("Login method");
			}
			
		};
		
	l.login();
		

	}

}
