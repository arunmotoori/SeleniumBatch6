package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentyThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Point point = driver.findElement(By.name("search")).getLocation();
		
		System.out.println(point.x);
		System.out.println(point.y);
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		driver.quit();

	}

}
