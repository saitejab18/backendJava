package com.dl.valueasattribute;

public class Location {
private String cname;
 private String city;
 private Student student;
 public Location() {
	
}
public Location(String cname, String city, Student student) {
	
	this.cname = cname;
	this.city = city;
	this.student = student;
}
@Override
public String toString() {
	return "Location [cname=" + cname + ", city=" + city + ", student=" + student + "]";
}

 
 
 
}
