package com.dl.one.comparable;

import java.util.HashMap;

public class Eg2 {

	public static void main(String[] args) 
	{
             HashMap<Integer,String> hashmap= new HashMap<>();
             hashmap.put(1,"Name1");
             hashmap.put(2,"Name2");
             hashmap.put(3,"Name3");
             hashmap.put(4,"Name4");
             hashmap.put(5,null);
             
             System.out.println(hashmap.size());
             System.out.println(hashmap);
             
             System.out.println(hashmap.remove(2));
             System.out.println(hashmap);
             
             System.out.println(hashmap.remove(3, "duplicate"));
             System.out.println(hashmap);
             
             hashmap.clear();
             System.out.println(hashmap);
            
	}

}
