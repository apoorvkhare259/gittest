package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
   
public class WebTables {
	
	public static void main(String[] args) {
		
		WebDriver wd;
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?"); 
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement baseTable = wd.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    wd.close();
		
		
	}

}
