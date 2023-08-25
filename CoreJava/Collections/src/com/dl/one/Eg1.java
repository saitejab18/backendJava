package com.dl.one;

import java.util.ArrayList;

public class Eg1 {

	public static void main(String[] args) {
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
       arraylist.add(10);
       arraylist.add(20);
       arraylist.add(30);
       arraylist.add(40);
       arraylist.add(50);
       
       System.out.println(arraylist);
       
       arraylist.add(2,200);
       arraylist.add(4,400);
       arraylist.add(6,600);
       arraylist.add(7,700);
       arraylist.add(8,800);
       
       System.out.println(arraylist);
       
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(10000);
       list.add(20000);
       list.add(30000);
       list.add(40000);
       list.add(50000);
       
       list.addAll(0, arraylist);
       System.out.println(list);
	}

}
