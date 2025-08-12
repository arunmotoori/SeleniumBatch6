package webdriverpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		WebDriver driver = null;
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else if(browserName.equals("ie")) {
			driver = new InternetExplorerDriver();
		}else if(browserName.equals("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

	}

}
