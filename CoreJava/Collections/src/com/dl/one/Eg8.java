package com.dl.one;

import java.util.ArrayList;
import java.util.HashSet;

public class Eg8 {

	public static void main(String[] args) 
	{
		 ArrayList<String> list = new ArrayList<>();
         list.add("Name1");
         list.add("Name2");
         list.add("Name3");
         list.add("Name4"); 
         list.add("Name1");
         list.add("Name3");
         System.out.println(list);
         
         HashSet<String> hashset = new HashSet<>(list);
         System.out.println(hashset);
	}

}
