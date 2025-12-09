package prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//laptop
		
		driver.findElement(By.name("q")).sendKeys("Laptop");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement laptop7 = driver.findElement(By.xpath("(//a[@class='k7wcnx'])[7]"));
		System.out.println("Laptop no.7: " + laptop7.getText());
		System.out.println("------------------------");
		
		//tv
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("TV");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement tv13 = driver.findElement(By.xpath("(//a[@class='k7wcnx'])[13]"));
		System.out.println("TV no.13: " + tv13.getText());
		System.out.println("------------------------");
		
		//smart phone
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Smart Phone");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement phone2 = driver.findElement(By.xpath("(//a[@class='k7wcnx'])[2]"));
		System.out.println("Smart Phone no.2: " + phone2.getText());
	
		driver.quit();
	   
		 
		 
	 

		 
		
	
		
		
		
		
		

	}

}
