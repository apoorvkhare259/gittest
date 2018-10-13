package StepDefenations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	static WebDriver driver;
	

@Given("^I launch browser$")
public void i_launch_browser() {
	System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
  	driver =new ChromeDriver();
      
}

@When("^I Enter url of facebook\\.com$")
public void i_Enter_url_of_facebook_com() {
	driver.get("http://www.facebook.com");
	System.out.println("Open facebook");

}

@Then("^I verify that page is displaying a title\\.$")
public void i_verify_that_page_is_displaying_a_title() {
        String actualtitle = driver.getTitle();
        String Expectedtitle ="Facebook � log in or sign up";
        assertEquals(actualtitle,Expectedtitle);
        System.out.println(driver.getTitle());
        
	
}

@Then("^I Close the browser$")
public void i_Close_the_browser() {
	driver.close();
}



}
