package com.dl.one.comparable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Eg3 {

	public static void main(String[] args) 
	{

		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1,"Name1");
		hashmap.put(2,"Name2");
		hashmap.put(3,"Name3");
		hashmap.put(4,"Name4");
		hashmap.put(5,"Name5");
		
		System.out.println(hashmap);
		
		Collection<String> values = hashmap.values();
		System.out.println(values);
		
		Set<Integer> keyset = hashmap.keySet();
		System.out.println(keyset);

	}

}
