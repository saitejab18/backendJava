package com.dl.one;

import java.util.ArrayList;

public class Eg7 {

	public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("Name1");
         list.add("Name2");
         list.add("Name3");
         list.add("Name4");
         System.out.println(list);
         
         ArrayList<String> arraylist = new ArrayList<>(list);
         
         arraylist.add("Name6");
         arraylist.add("Name7");
         arraylist.add("Name8");
         System.out.println(arraylist);
         
	}

}
