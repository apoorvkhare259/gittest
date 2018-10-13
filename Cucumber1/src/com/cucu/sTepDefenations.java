package com.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sTepDefenations {

	WebDriver driver;

@Given("^I launch Chrome browser$")
public void i_launch_Chrome_browser() {
	System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
  	WebDriver driver =new ChromeDriver();
  	throw new PendingException();
}

@When("^I open Google Homepage$")
public void i_open_Google_Homepage() {
	driver.get("http://google.co.in");
  	throw new PendingException();
}

@Then("^I verify that the page displays search text box$")
public void i_verify_that_the_page_displays_search_text_box() {

	driver.findElement(By.id("lst-ib")).isDisplayed();
	
	
	throw new PendingException();
}

@Then("^the page displays Google Search button$")
public void the_page_displays_Google_Search_button() {
   driver.findElement(By.id("btnK")).isDisplayed();
   
	
	throw new PendingException();
}

@Then("^the page displays Im Feeling Lucky button$")
public void the_page_displays_Im_Feeling_Lucky_button() {

	driver.findElement(By.id("btnI")).isDisplayed();
	
	throw new PendingException();
}


	
	
}
