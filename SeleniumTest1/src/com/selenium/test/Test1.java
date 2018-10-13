 package com.selenium.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
  
public class Test1 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		//to handle webtables
      	WebDriver driver =new ChromeDriver();
	// driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
//	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //  driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
	 //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
     // 	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
      	driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
	 // driver.close();
	  List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	  
	   System.out.println("numbers of columns are" +col.size());
	   
	   List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	   
	   System.out.println("numbers of rows are: "+rows.size());
	  
	  //to go to row data in table
		 WebElement baseTable = driver.findElement(By.tagName("table"));
		  
		 //To find third row of table
		 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
         String rowtext = tableRow.getText();
		 System.out.println("Third row of table : "+rowtext);
		    
		    //to get 3rd row's 2nd column data
		    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	/*List<WebElement> links=  driver.findElements(By.tagName("a"));

	  System.out.println(links.size());
	  
	 
	  for (int i= 0; i<links.size(); i++) {
		  
		  
		  System.out.println(links.get(i).getAttribute("href"));
		  
		  
	  }
	  */
	  
	  
	  
	  
	 /* // to get screen shot using this code      
	  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	 
	  
	  Files.copy(screenshotFile, new File("E:\\screeenshotgoogle.png"));	  
		*/
		
		
	}
	
	
	

}