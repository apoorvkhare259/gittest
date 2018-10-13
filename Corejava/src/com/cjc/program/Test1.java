package com.cjc.program;

public class Test1 {
	
	public static void main(String[] args) {
		
		Student1 amol = new Student1();
		
		amol.setRollno(1);
		amol.setName("Amit T");
		
		Address ladr = new Address();
		ladr.setLocalcity("Pune");
		ladr.setPermanentcity("Panna");
		
		
		amol.setPaddress(ladr);
		amol.setAddress(ladr);
		System.out.println(amol.getPaddress().getLocalcity());
		System.out.println(amol.getAddress().getPermanentcity());
		
		
		 
		
		
		
		System.out.println(amol.getName());
		System.out.println(amol.getRollno());
		
		Student1 amit  = new Student1();
		amit.setName("Amit");
		amit.setRollno(2);
		
		System.out.println(amit.getName());
		System.out.println(amit.getRollno());
		
		
		
		
	}

}
