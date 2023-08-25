package com.dl.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Eg2 
{

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Name1");
        list.add("Name2");
        list.add("Name3");
        list.add("Name4");
        System.out.println(list);
        
        ListIterator<String> iterator = list.listIterator();
       
        System.out.println();
        while(iterator.hasPrevious());{
        System.out.println(iterator.previous());
        
        }
	}

}
