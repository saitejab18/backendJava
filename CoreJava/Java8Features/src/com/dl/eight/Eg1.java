package com.dl.eight;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg1 {

	public static void main(String[] args)
	{
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       System.out.println(list);
       
       list.forEach(System.out::println);
       
       System.out.println();
       
       Iterator<Integer> iterator = list.iterator();
       while(iterator.hasNext()) {
    	   System.out.println(iterator.next());
       }
       System.out.println();
       
       list.forEach(x -> System.out.println(x));
	}

}
