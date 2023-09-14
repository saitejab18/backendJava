package com.dl.set;

import java.util.Set;

public class Honda {

	//properties
	private String sname;
    private Set<String> models;
    
    public Honda() {
		
	}
    
	public Honda(String sname, Set<String> models) {
		this.sname = sname;
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [sname=" + sname + ", models=" + models + "]";
	}
    
    
}