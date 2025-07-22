package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFour {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//driver.findElement(By.linkText("jqueryui")).click();
		//driver.findElement(By.linkText("jquery")).click();
		driver.findElement(By.partialLinkText("jquery")).click();

	}

}
