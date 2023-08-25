package com.dl.six;

interface A{
	default void m1() {
		System.out.println("M1 method");
	}
}

public class Eg1 implements A{

	public static void main(String[] args)
	{
              Eg1 eg = new Eg1();
              eg.m1();
	}

}
