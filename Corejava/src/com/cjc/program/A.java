//using static variable 


package com.cjc.program;

public class A {

	int a ;
	
	static int b ;
	
	
	public static void main(String[] args) {
		
		
		A a = new A();
		a.a=100;
		a.b=100;
		
		A b = new A();
		b.a=200;
		b.b=200;
		
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(b.a);
		System.out.println(b.b);
		
	}
	
	
	
	
	
	
	
	
	

}
