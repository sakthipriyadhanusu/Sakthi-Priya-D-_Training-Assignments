package prgms;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Crossbrowsertest {

	public static void main(String[] args) {

        WebDriver driver = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name: ");
        String browser = sc.nextLine();

        if (browser.equalsIgnoreCase("chrome")) 
        {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) 
        {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) 
        {
            driver = new EdgeDriver();
        } 
        else 
        {
            System.out.println("Invalid browser name");
            sc.close();
            return;
        }

        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        
        
		

	}

}
