package com.selenium.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeys {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
      	WebDriver driver =new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;  
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,2000)");
		
	}

}
