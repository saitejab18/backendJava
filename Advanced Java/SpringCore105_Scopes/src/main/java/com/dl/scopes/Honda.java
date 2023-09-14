package com.dl.scopes;

public class Honda 
{
    private String carmodel;
    private long price;
    
    public Honda() 
    {

	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Honda [carmodel=" + carmodel + ", price=" + price + "]";
	}
    
}
