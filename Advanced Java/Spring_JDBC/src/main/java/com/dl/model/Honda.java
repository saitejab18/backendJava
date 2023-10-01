package com.dl.model;

public class Honda {
	
	//Properties
	private int id;
	private String bikeName;
	private String bikeColor;
	private double cc;
	
	public Honda(int i, String string, String string2, double d) {
		
	}
	//setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikeColor() {
		return bikeColor;
	}
	public void setBikeColor(String bikeColor) {
		this.bikeColor = bikeColor;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	
	//toString
	@Override
	public String toString() {
		return "Honda [id=" + id + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + ", cc=" + cc + "]";
	}
	
}