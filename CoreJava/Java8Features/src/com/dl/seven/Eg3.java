package com.dl.seven;
class AA{
	public void m1(int i) {
   	 System.out.println("AA method" + i);
    }
}
class BB extends AA{
	@Override
	public void m1(int i) {
   	 System.out.println("BB method" + i);
    }
}

public class Eg3 {

	public static void main(String[] args) {
         BB b = new BB();
         b.m1(10);
	} 
}
