package com.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	WebDriver driver;
	
	@BeforeTest
	public void intiatebrowser() {
		
               Reporter.log("Browser Open");
		
	}
	
	
	
	
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		
		
        System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
      	WebDriver driver =new ChromeDriver();
	    driver.get("https://hi-in.facebook.com/login/");
	    System.out.println(driver.getTitle());
	    Assert.assertEquals("Facebook", driver.getTitle());
	    Reporter.log("facebook open ");
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		Reporter.log("facebook open ", true);

		
		
		
	}

	
	/*@DataProvider 
	                                                
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "zxcvb";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";

	return data;
	}*/
	
	

}
