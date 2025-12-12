package assignment7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
  @Test
  public void Navigation() throws InterruptedException 
  {
	  	WebDriver driver = new ChromeDriver();
	  	driver.get("https://www.snapdeal.com/");
	  	Thread.sleep(5000);
	  	driver.navigate().to("https://www.amazon.in/");
	  	Thread.sleep(3000);
	  	driver.navigate().back();
	  	Thread.sleep(3000);
	  	driver.navigate().forward();
	  	Thread.sleep(3000);
	  	driver.navigate().refresh();
	  	Thread.sleep(3000);
	  	
	  
  }
}
