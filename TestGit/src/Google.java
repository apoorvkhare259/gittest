import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	
	WebDriver driver;
	
public void openbrowser() {		
		System.setProperty("webdriver.chrome.driver","F://Software//drivers//chromedriver.exe");
		//to handle webtables
        driver =new ChromeDriver();
      	driver.get("http://google.com");
		
}

}
