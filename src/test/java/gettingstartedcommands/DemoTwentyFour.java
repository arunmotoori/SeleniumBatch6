package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentyFour {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Rectangle rect = driver.findElement(By.name("search")).getRect();
		
		System.out.println(rect.height);
		System.out.println(rect.getHeight());
		System.out.println(rect.width);
		System.out.println(rect.getWidth());
		System.out.println(rect.x);
		System.out.println(rect.getX());
		System.out.println(rect.y);
		System.out.println(rect.getY());
		
		driver.quit();

	}

}
