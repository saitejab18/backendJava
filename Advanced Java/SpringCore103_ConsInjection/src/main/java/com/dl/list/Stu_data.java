package com.dl.list;

import java.util.List;

public class Stu_data 
{
	private String section;
	private List<String> students;
	public Stu_data() 
	{
		
	}
	public Stu_data(String section, List<String> students) 
	{
		this.section = section;
		this.students = students;
	}
	@Override
	public String toString() {
		return "Honda [section=" + section + ",students=" + students + "]";
	}
	
	

}
