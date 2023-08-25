package com.dl.two;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Employe emp1 = new Employe(4, "A");
		Employe emp2 = new Employe(2, "C");
		Employe emp3 = new Employe(1, "B");
		Employe emp4 = new Employe(5, "E");
		Employe emp5 = new Employe(3, "D");
		ArrayList<Employe> list = new ArrayList<Employe>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		System.out.println("Insertion Order: " + list);
		
		Collections.sort(list, new CompareIds());
		System.out.println("Asending Order Id's: " + list);
		Collections.sort(list, new CompareNames());
		System.out.println("Asending Order Names: : " + list);

}
}


