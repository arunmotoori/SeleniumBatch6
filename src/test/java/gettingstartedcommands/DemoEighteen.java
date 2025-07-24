package gettingstartedcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEighteen {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String hmtlCode = driver.getPageSource();
	
		System.out.println(hmtlCode);
		
		driver.quit();

	}

}
