package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSixteen {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		boolean status1 = driver.findElement(By.cssSelector("input[value='Bike']")).isSelected();
		System.out.println(status1); 
		
		boolean status2 = driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected();
		System.out.println(status2);
		
		boolean status3 = driver.findElement(By.cssSelector("input[value='Pen'][name='accessories']")).isSelected();
		System.out.println(status3);
		
		boolean status4 = driver.findElement(By.cssSelector("input[value='Book'][name='accessories']")).isSelected();
		System.out.println(status4);
		
		driver.quit();
	}

}
