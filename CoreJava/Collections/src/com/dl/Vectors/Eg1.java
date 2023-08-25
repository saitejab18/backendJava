package com.dl.Vectors;

import java.util.Vector;

public class Eg1 {

	public static void main(String[] args) {
           Vector<String> vector = new Vector<>();
           vector.add("Name1");
           vector.add("Name2");
           vector.add("Name3");
           vector.add("Name4");
           
           System.out.println(vector);
           
           Vector<String> v = new Vector<>(vector);
           v.add("Name5");
           v.add("Name6");
           v.add("Name7");
           System.out.println(v);
           
	}

}
