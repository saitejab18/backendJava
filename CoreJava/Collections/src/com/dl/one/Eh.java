package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Eh {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		System.out.println(list);
		
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		
		
	}

}
