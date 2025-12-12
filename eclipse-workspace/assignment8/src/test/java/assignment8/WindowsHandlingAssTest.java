package assignment8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandlingAssTest {
  @Test
  public void f() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  
  }
}
