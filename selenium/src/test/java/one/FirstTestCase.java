package one;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//webDriver initialization
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//webPage declaration
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click(); 
		
		//Title match using if else
		String ExpectedTitle = "swag labs";
		String ActualTitle = driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title match");
		}
		else {
			System.out.println("Title doesn't match");
		}
		
		//Navigation command
		Thread.sleep(5000);
		//driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.close();
		//driver.quit();
	}

}
