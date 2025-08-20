package handlingcalendarpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/");
		
		WebElement field = driver.findElement(By.name("bdaytime"));
		field.sendKeys("15032027");
		field.sendKeys(Keys.TAB);
		field.sendKeys("1235");
		field.sendKeys(Keys.TAB);
		field.sendKeys(Keys.ENTER);

	}

}
