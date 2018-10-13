package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
 
	@Test
	public void testm1() {
		
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		
      	WebDriver driver =new ChromeDriver();
	  driver.get("http://www.google.co.in");
	 // driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=b627f46aa8855762ae8f1360bd3d5151");
		
	}
}
