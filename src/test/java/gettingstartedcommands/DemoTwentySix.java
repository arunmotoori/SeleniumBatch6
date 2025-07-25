package gettingstartedcommands;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentySix {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Dimension d = new Dimension(900,800);
		driver.manage().window().setSize(d);
		
		System.out.println(driver.getClass().getSimpleName());

	}

}
