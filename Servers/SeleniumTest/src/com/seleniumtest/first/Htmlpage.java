package com.seleniumtest.first;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Htmlpage {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		
      	WebDriver driver =new ChromeDriver();
      	
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      	
      	driver.get("http://demo.guru99.com/test/delete_customer.php");
      	
    /*  	
      	driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Apoorv");
      	
 WebElement drpdwn= driver.findElement(By.xpath("/html/body/form/select"));
		 
		 Select sel= new Select(drpdwn);
		 
		 sel.selectByValue("volvo");
		 Thread.sleep(3000);
		 sel.selectByValue("saab");
		 
		 sel.deselectByValue("volvo");
			
		 WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/input[5]")));
		     button.click();
		     
	WebElement buttono=	    wait.until(ExpectedConditions.el  
		
	WebElement chkbox=	driver.findElement(By.name("vehicle2"));
	   System.out.println(chkbox.isSelected());
	
		 
		 WebElement ele3 = driver.findElement(By.name("vehicle2"));
		 
		      System.out.println(ele3.isDisplayed());
		      
		*/      
		      //
		      
		 
File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File("E:\\SoftwareTestingMaterial.png"));

		
		
		
		
	}
	
	

}
