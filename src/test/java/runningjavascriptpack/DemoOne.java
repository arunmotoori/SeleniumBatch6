package runningjavascriptpack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("alert('Alert from Arun');");
	
	}

}
