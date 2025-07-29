package handlingwindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
		driver.findElement(By.id("selenium143")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		String childWindowOne = null;
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				childWindowOne = window;
				break;
			}
		}
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(3000);
		
		windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		String childWindowTwo = null;
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				if(!window.equals(childWindowOne)) {
				   childWindowTwo = window;
				   break;
				}
			}
		}
		
		driver.switchTo().window(childWindowOne);
		driver.findElement(By.linkText("What is Selenium?")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(childWindowTwo);
		
		String pageHeading = driver.findElement(By.cssSelector("h3")).getText();
		System.out.println(pageHeading);
		
		driver.close();
		
		driver.switchTo().window(childWindowOne);
		
		driver.findElement(By.linkText("Index Page")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("q")).sendKeys("Arun Motoori");
		
	}

}
