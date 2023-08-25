package com.dl.two;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Override
	public int compareTo(Employee emp) {
		
		if(this.id > emp.id) {
			return 1;
		}
			else {
				return -1;
			}
		}
			
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) 
	{
		Employee e1 = new Employee(3,"D");
		Employee e2 = new Employee(1,"B");
		Employee e3 = new Employee(4,"A");
		Employee e4 = new Employee(2,"C");
		
		ArrayList<Employee> list = new  ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
	

	}

}
