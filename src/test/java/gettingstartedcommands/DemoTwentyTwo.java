package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentyTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Dimension dimension = driver.findElement(By.name("search")).getSize();
		
		System.out.println(dimension.height);
		System.out.println(dimension.width);
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		
		driver.quit();

	}

}
