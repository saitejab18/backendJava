package com.dl.Vectors;

import java.util.Vector;

public class Eg2
{

	public static void main(String[] args)
	{
      
		 Vector<String> vector = new Vector<>();
         vector.add("Name1");
         vector.add("Name2");
         vector.add("Name3");
         vector.add("Name4");
         System.out.println(vector);
         
         System.out.println(vector.firstElement());
         System.out.println(vector.lastElement());
         
         vector.clear();
         
         System.out.println(vector);
	}

}
