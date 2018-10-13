package com.real.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Factory {
	
	public static void main(String[] args) {
		
	
	List col= new ArrayList<>();
	
	Bike b1 = new Bike();
     b1.setEnginename("Petrol");
	b1.setModelname("Pulser");
	
	Bike b2 = new Bike();
	b2.setEnginename("Diesal");
	b2.setModelname("RoyalEnfield");
	  col.add(b1);
	  col.add(b2);
	  
	  Iterator itr = col.iterator();
	  while(itr.hasNext()) {
		Bike b = (Bike) itr.next();
		b.display();
	  }
	  }
	 
	
	
}
