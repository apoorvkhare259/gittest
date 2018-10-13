package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		//to handle webtables
      	WebDriver driver =new ChromeDriver();
      	
      	driver.get("http://demo.guru99.com/test/guru99home/");  
      	driver.manage().window().maximize();

		
      	int size = driver.findElements(By.tagName("iframe")).size();
           System.out.println(size);
           
           driver.switchTo().frame("a077aa5e");
           driver.findElement(By.xpath("/html/body/a/img")).click();
	}
	
}
