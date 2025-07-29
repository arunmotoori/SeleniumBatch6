package handlingwindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		driver.findElement(By.id("selenium143")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		String childWindow = null;
		
		for(String window : windows) {
			
			if(!window.equals(parentWindow)) {
				childWindow = window;
				break;
			}
		
		}
		
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.linkText("What is Selenium?")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("q")).sendKeys("Arun Motoori");
		

	}

}
