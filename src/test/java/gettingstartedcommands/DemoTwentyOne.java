package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentyOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement cartButton = driver.findElement(By.cssSelector("button[class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));

		String str = cartButton.getCssValue("font-size");
		System.out.println(str);
		
		driver.quit();
	}

}
