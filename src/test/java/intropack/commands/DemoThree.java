package intropack.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DemoThree {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver","C:\\QAFox\\WorkspaceBatch6\\SeleniumProject\\drivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		//WebDriver driver= new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		if(driver.findElement(By.linkText("HP LP3065")).isDisplayed()) {
			System.out.println("Test Passed");
		}
		
		//driver.quit();

	}

}
