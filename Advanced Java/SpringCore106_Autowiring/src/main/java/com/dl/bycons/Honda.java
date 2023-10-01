package com.dl.bycons;

public class Honda 
{
	private Models models;
	public Honda() {
		
	}
	

	public Honda(Models models) {
		
		this.models = models;
	}


	public Models getModels() {
		return models;
	}

	public void setModels(Models models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
}
