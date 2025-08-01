package handlingpopusnotificationsdialogspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		driver.findElement(By.xpath("//div[text()='We are Hiring']")).click();

	}

}
