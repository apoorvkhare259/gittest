package com.excel.reader;

import java.io.IOException;

public class CheckExcel {
	
	
	public static void main(String[] args) throws Exception {
		
		
		CheckExcel ch = new CheckExcel();
		
		
		String Path ="F:\\Software\\selenium\\Book1.xlsx";
		
		ReadExcel.setExelfile(Path, "Sheet1");
		
		//row number is declare by i in loop
		for (int i=0; i<=3; i++) {
			
			
			String words = ReadExcel.getCellData(i, 2);
			System.out.println(words);
			
			 
		}
		
		
		
	}
	
	
	

}
