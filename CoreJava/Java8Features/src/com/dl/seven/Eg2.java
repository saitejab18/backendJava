package com.dl.seven;
@Deprecated
class A{
	int abc = 10;
	int xyz = 20;
	public void m1() {
   	 System.out.println("M1 method");
    }
	public void m2() {
   	 System.out.println("M2 method");
    }
}

class B extends A{
	public void m3() {
		System.out.println("M3 method");
	}
}

public class Eg2 {

	public static void main(String[] args)
	{
         B b = new B();
         b.m1();
         b.m2();
         b.m3();
         
         System.out.println(b.xyz);
         System.out.println(b.abc);
	}

}
