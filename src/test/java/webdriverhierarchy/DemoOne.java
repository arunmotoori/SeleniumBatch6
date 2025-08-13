package webdriverhierarchy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoOne {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("");
		
		TakesScreenshot tsDriver = (TakesScreenshot)driver;
		File src = tsDriver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("Screenshots\\homePage.png"));
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		driver.quit();

	}

}
