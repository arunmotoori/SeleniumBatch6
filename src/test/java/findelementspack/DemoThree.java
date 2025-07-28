package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='content']//a"));
		
		for(WebElement link : links) {
			link.click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		
		driver.quit();

	}

}
