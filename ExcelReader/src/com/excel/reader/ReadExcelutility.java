package com.excel.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelutility {
	
	public static String getCellData(String xlpath, String sheet, int row, int cell) {

 String v ="";
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("F:\\Software\\selenium\\Book1.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
				v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			

			
		} catch (Exception e) {

		}
		return v;

		
		
	}
	
	
	public static int getRowcount(String xlpath, String sheet) {
	  int rc=0;
		
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			rc= wb.getSheet(sheet).getLastRowNum();
			
			
		} catch (Exception e) {

		}
		
		return rc;
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
	
	
	/*FileInputStream fis = new FileInputStream("F:\\Software\\selenium\\Book1.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Cell c = wb.getSheet("Sheet1").getRow(4).getCell(0);
	 System.out.println(c);
	 
	*/	   String xlpath="F:\\Software\\selenium\\Book1.xlsx";
           String sheet ="Sheet1";
           int row=0;
           int cell=0;
	 
	   ReadExcelutility read = new ReadExcelutility();
	   int c =read.getRowcount(xlpath, sheet);
	   for(int i=0; i<=c; i++) {
		   
		   String d1=read.getCellData(xlpath, sheet, i, 0);
		   String dl= read.getCellData(xlpath, sheet, i, 4);
		   
		   System.out.println(d1);
		   System.out.println(dl);
		   
	   }

	
	
	
	}
	

}
