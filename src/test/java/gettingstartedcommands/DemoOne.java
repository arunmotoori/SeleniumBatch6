package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        
        driver.findElement(By.id("input-email")).sendKeys("amotooricap6@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
       
	}

}
