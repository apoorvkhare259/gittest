package com.cjc.program;

public class Sololearn{
	
	
	public static void main(String[] args) {
		 int max =0;
         int max2=0;
		
		int a [] = {12,32,42,11};
	 
	
for(int i=0; i<a.length; i++) {
	
	if(a[i]>max) {
		
		max =a[i];
		
				
	}
	}

System.out.println(max);


for(int j=0; j<a.length; j++) {
	
	if(a[j]>max2 && a[j]<max) {
		
		max2=a[j];
	
			
	}
	
	
}
		
System.out.println(max2);
	
 	
			
		}
		
		
		
	}


