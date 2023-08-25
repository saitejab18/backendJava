package com.dl.three;

@FunctionalInterface
interface Methods{
	void add();
}

public class Eg1{
	int a;
	int b;
	public Eg1(int a,int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void display() {
		Methods m = ()-> System.out.println(a+b);
		m.add();
		
		Methods m1 = () -> 
		{
			System.out.println(a+b);
		};
		m1.add();
	}
		
		public static void main(String[] args) {
		Eg1 eg = new Eg1(10,20);
		eg.display();
			
		}
		
		
		
	}


		

	