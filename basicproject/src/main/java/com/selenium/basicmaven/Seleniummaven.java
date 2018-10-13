package com.selenium.basicmaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniummaven {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
      
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		driver.findElement(By.id("email_create")).sendKeys("apoorvkhare259@yahoo.com");
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//WebElement ele1=	driver.findElement(By.xpath("//*[@id=\'id_gender1\']"));
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement  ele1=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'id_gender1\']")));
            ele1.click();
		  
		
	}	

}
 