package com.real.collections;

public class Bike {
	
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getEnginename() {
		return enginename;
	}
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}
	String modelname;
	String enginename;
	
	public void display() {
		
		System.out.println(modelname+" "+enginename);
	}
	
}
