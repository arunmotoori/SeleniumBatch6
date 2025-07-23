package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEleven {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageOneUrl = driver.getCurrentUrl();
		
		System.err.println(pageOneUrl);
		
		driver.findElement(By.linkText("jqueryui")).click();
		
		String pageTwoUrl = driver.getCurrentUrl();
		
		System.out.println(pageTwoUrl);
		
		//driver.close();
		
		driver.quit();

	}

}
