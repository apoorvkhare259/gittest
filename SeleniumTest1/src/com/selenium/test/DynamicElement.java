package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
      	WebDriver driver =new ChromeDriver();

		driver.get("https://www.blablacar.in/search?fn=PuneSatar+Rd%2C+KK+Market+Road%2C+KK+Market%2C+Mangawadi%2C+Pune%2C+Maharashtra%2C+India&fc=18.4695733%7C73.8601922&fcc=IN&fp=1&tn=Mumbai%2C+Maharashtra%2C+India&tc=19.0759837%7C72.8776559&tcc=IN&tp=0&db=2018-10-07&s_uuid=8f7c4521-7cb4-4d67-8457-d22c27ec4637");
		
		driver.findElement(By.xpath("//*[starts-with(@id,\"dp153\")]")).click();
	}

}
