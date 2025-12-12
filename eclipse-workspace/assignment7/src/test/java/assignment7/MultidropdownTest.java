package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultidropdownTest {
  @Test
  public void MultipleDropDown() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demo.mobiscroll.com/select/multiple-select");
	  driver.findElement(By.id("multiple-select")).click();
	  
	  driver.findElement(By.xpath("//div[text()='Books']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Movies, Music & Games']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Electronics & Computers']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Toys, Kids & Baby']")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//span[text()='Set']")).click();
	  driver.quit();
	 
	  
	  
	  
	  
  }
}
