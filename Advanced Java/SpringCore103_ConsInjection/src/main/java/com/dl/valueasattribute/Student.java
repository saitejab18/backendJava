package com.dl.valueasattribute;

public class Student 
{
  private String sname;
  private int rollno;
  private String branch;
  public Student() 
  {
	
}
public Student(String sname, int rollno, String branch) {
	this.sname = sname;
	this.rollno = rollno;
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", rollno=" + rollno + ", branch=" + branch + "]";
}

  
}
