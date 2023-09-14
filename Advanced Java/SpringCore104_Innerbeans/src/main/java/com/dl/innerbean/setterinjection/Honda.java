package com.dl.innerbean.setterinjection;

public class Honda {
	private HondaCars hondaCars;
	
	public Honda() {
		
	}

	public HondaCars getHondaCars() {
		return hondaCars;
	}

	public void setHondaCars(HondaCars hondaCars) {
		this.hondaCars = hondaCars;
	}

	@Override
	public String toString() {
		return "Honda [hondaCars=" + hondaCars + "]";
	}
	

}
