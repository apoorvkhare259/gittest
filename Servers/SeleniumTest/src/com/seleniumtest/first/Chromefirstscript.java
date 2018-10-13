package com.seleniumtest.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chromefirstscript {
	
	
	public static void main(String[] args) {
		
		
             //setup for bro  wser
		
		    System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
	      	WebDriver driver =new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		
		//  driver.get("http://www.google.co.in");
		  driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php?osCsid=b627f46aa8855762ae8f1360bd3d5151");
		  driver.manage().window().maximize();  //to get full screen browser
		  WebDriverWait wait = new WebDriverWait(driver,10);
	      WebElement ele1 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName1")));
		  ele1.sendKeys("Apoorv");
	
		 driver.findElement(By.name("lastName")).sendKeys("Khare");
		 
		 
	//================================================================= 
		 
		 
		 
		 
		 WebElement drpdwn= driver.findElement(By.name("country"));
		 
		           Select sel= new Select(drpdwn);
		           sel.selectByValue("234");
		// sel.selectByIndex(6);
		// sel.selectByVisibleText("ANTARCTICA ");
             	   sel.selectByIndex(5);
	//	 =================================================================
		 
		              
		       
		     
		/*     //using drop down
		     
		     WebElement ele = driver.findElement(By.name("country"));
		     
		     Select sel = new Select(ele);
		     
		     sel.selectByValue("3");
		     
		  */
		  
		   WebElement link = driver.findElement(By.tagName("a"));
		   System.out.println(link.getSize()); 
		     	
		
	}

}
