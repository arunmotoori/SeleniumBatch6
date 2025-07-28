package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
		int noOfLinks = links.size();
		
		for(int i=1;i<=noOfLinks;i++) {
			String xpathText = "(//div[@id='LinkList1']//a)["+i+"]";
			WebElement link = driver.findElement(By.xpath(xpathText));
			link.click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		
//		List<WebElement> links = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
//		
//		for(WebElement link : links) {
//			link.click();
//			System.out.println(driver.getCurrentUrl());
//			driver.navigate().back();
//		}
		
		driver.quit();

	}

}
