package com.dl.two;

import java.util.Comparator;

public class CompareNames implements Comparator<Employe>{
	//Ascending Order
	@Override
	public int compare(Employe o1, Employe o2) {
	return o1.name.compareTo(o2.name);
	}
	}
