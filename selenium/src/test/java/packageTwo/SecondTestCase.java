package packageTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondTestCase {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//Radiobutton
		WebElement radiobutton = driver.findElement(By.id("male"));
		radiobutton.click();
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		
		//Dropdown
		WebElement testDropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropdown);
		//index
		//dropdown.selectByIndex(2);
		//value
		//dropdown.selectByValue("option 1");
		//visible
		dropdown.selectByVisibleText("Option 3");
		
		
		
		
		
	}

}
