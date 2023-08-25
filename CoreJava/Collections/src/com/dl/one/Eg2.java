package com.dl.one;

import java.util.ArrayList;

public class Eg2 {

	public static void main(String[] args) 
	{
         ArrayList<String> list = new ArrayList<String>();
         list.add("NameZero");
         list.add("NameOne");
         list.add("NameTwo");
         list.add("NameThree");
         System.out.println(list);
         System.out.println(list.size());
         
         list.set(0,"Sai Kiran");
         System.out.println(list);
	}

}
