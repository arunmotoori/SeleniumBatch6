package handlingkeyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("amotooricap6@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		//driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
		
		Actions actions = new Actions(driver);
		
		//actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		actions.sendKeys(Keys.ENTER).perform();
		
	}

}
