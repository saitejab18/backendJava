package com.dl.one.comparable;

import java.util.LinkedHashMap;

public class Eg4 {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(2,"Name2");
		linkedhashmap.put(1,"Name1");
		linkedhashmap.put(4,"Name4");
		linkedhashmap.put(5,"Name5");
		linkedhashmap.put(3,"Name3");
		linkedhashmap.put(4,"Name4Duplicate");
		
		System.out.println(linkedhashmap);
	}

}
