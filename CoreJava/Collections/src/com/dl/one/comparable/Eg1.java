package com.dl.one.comparable;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args)
	{
           HashMap<Integer, String> hashmap = new HashMap<>();
           hashmap.put(4,"Name4");
           hashmap.put(2,"Name2");
           hashmap.put(5,"Name5");
           hashmap.put(1,"Name1");
           hashmap.put(3,"Name1");
          
           hashmap.put(7,null);
           hashmap.put(8,null);
           hashmap.put(null,null);
           hashmap.put(null,null);
           System.out.println(hashmap); //{null=null, 1=Name1duplicate, 2=Name2, 3=Name3, 4=Name4, 5=Name5, 7=null, 8=null}
           
	}

}
