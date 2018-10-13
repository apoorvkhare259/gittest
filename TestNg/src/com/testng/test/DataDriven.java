package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	WebDriver driver;
	
	@Test(dataProvider ="getdata")
	public void setdata(String username , String password) {
		
		/*  System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
	      	WebDriver driver =new ChromeDriver();
		    driver.get("https://hi-in.facebook.com/login/");
		    driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).click();
		    
		*/
		
		System.out.println(username);
		System.out.println(password);
		
		
	}
	
	
	
	
	
	
	@DataProvider
	public Object [][] getdata(){
		
		Object [][] data =  new Object [3][2];
		//first row
		data[0][0] = "username1";
        data[0][1]= "pwd1";
           
        //second row
        data[1][0] = "username2";
        data[1][1]= "pwd2";	
        // third row		
        data[2][0] = "username3";
        data[2][1]= "pwd3";
        
        return data;
        
		
	}
	
	
	

}
