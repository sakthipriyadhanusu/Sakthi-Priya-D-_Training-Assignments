package prgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("Sakthi");
		
		driver.findElement(By.cssSelector(".btn-primary")).click();
		

	}

}
