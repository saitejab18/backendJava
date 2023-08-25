package com.dl.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eg1 {

	public static void main(String[] args) {
             List<String> list = new ArrayList<>();
             list.add("Name1");
             list.add("Name2");
             list.add("Name3");
             list.add("Name4");
             System.out.println(list);
             
             Iterator<String> iterator = list.iterator();
             while (iterator.hasNext()) {
            	 System.out.println(iterator.next());
             }
	}

}
