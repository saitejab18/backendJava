package com.dl.two;

@FunctionalInterface
interface Properties{
	void add(int a, int b);
}

public class Eg2 {

	public static void main(String[] args) {
           Properties p = (x,y) -> System.out.println("Sum of" + (x+y));
           p.add(10, 30);
	}

	}
