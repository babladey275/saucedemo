package packageThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdTestCase {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Xpath-Absolute path
		//driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
		
		//Xpath-Relative path(tagname[@attribute = 'value'])
		//driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
		
		//CSS path (tagname#id, tagname.classname)
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		
		
	}

}
