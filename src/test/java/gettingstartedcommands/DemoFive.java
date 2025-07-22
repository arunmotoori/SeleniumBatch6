package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		//driver.findElement(By.name("q")).sendKeys("Selenium Java");
		//driver.findElement(By.className("dropbtn")).click();
		//driver.findElement(By.linkText("jqueryui")).click();
		//driver.findElement(By.cssSelector("input[value='Login']")).click();
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//input[@value='Login'")).click();

	}

}
