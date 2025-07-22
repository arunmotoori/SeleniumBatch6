package intropack.commands;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize(); 
		
//		Options options = driver.manage();
//		Window window = options.window();
//		window.maximize();
		
		driver.manage().window().maximize();
		

	}

}
