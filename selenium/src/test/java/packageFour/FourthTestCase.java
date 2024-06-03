package packageFour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id = 'checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'first-name']")).sendKeys("Babla");
		driver.findElement(By.xpath("//input[@id = 'last-name']")).sendKeys("Dey");
		driver.findElement(By.xpath("//input[@id = 'postal-code']")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id = 'finish']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id = 'back-to-products']")).click();
		
		
	}

}
