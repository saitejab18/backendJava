package com.dl.innerbean.setterinjection;

public class HondaCars 
{
  private String carModels;
  public HondaCars() {


}
public String getCarModels() {
	return carModels;
}
public void setCarModels(String carModels) {
	this.carModels = carModels;
}
@Override
public String toString() {
	return "HondaCars [carModels=" + carModels + "]";
}

  
}
