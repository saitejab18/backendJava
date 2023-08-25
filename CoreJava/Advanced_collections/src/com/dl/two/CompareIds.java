package com.dl.two;

import java.util.Comparator;

public class CompareIds implements Comparator<Employe>
     {

			@Override
			public int compare(Employe emp1, Employe emp2)
			{
				
				Integer i = emp1.id;
				return i.compareTo(emp2.id);
				
			}
     	 
      }


