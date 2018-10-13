package com.cjc.program;

public class Minimumarrayelement {
	
	
	public static void main(String[] args) {
		
		
		int a [] = {4,6,7,1};
		
		int min =a[0];
		int min2=a[0];

		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]<min) {
				
				min = a[i];
				
			}
			
		}
		
		System.out.println(min);
		
		for(int j=0; j<a.length; j++) {
			
			if(a[j]<min2 && min<a[j]) {
				
				min2=a[j];
			}
			
		}
	
	System.out.println(min2);
	
	
	}
	
	

}
