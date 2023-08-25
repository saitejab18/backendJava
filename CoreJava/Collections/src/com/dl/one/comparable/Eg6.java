package com.dl.one.comparable;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Eg6 {

	public static void main(String[] args)
	{

		String s1 = new String("a");
		String s2 = new String("a");
		
		HashMap<String,String> hashmap = new HashMap<>();
		
		hashmap.put(s1, "A");
		hashmap.put(s2, "B");
		
		System.out.println(hashmap);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		IdentityHashMap<String, String> identityhashmap = new IdentityHashMap<>();
		identityhashmap.put(s1, "A");
		identityhashmap.put(s2,"B");
		
		System.out.println(hashmap);
		System.out.println(s1==s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		
	}

}
