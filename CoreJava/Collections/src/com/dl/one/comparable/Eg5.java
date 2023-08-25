package com.dl.one.comparable;

import java.util.LinkedHashMap;

public class Eg5 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(2,"Name2");
		linkedhashmap.put(3,"Name3");
		linkedhashmap.put(null,"Name1");
		linkedhashmap.put(null,"Name4");
		linkedhashmap.put(1,null);
		linkedhashmap.put(4,null);
		
		System.out.println(linkedhashmap); //{2=Name2, 3=Name3, null=Name4, 1=null, 4=null}
		
	}

}
