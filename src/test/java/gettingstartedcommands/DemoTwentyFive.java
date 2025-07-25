package gettingstartedcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwentyFive {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().fullscreen();
	
	}

}
