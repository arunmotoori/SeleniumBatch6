package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFourteen {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		boolean displayStatus = driver.findElement(By.id("drop1")).isDisplayed();
		System.out.println(displayStatus);
		
		boolean status = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println(status); 
		
		driver.quit();

	}

}
