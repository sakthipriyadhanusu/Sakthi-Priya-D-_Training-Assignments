package prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTagHerokuApp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total Anchor tags:"+links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getAttribute("href"));
		}

	}

}
