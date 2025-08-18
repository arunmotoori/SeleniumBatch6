package runningjavascriptpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//WebElement loginButton = driver.findElement(By.cssSelector("button[value='LogIn']"));
		
		//jse.executeScript("arguments[0].scrollIntoView('true');", loginButton);
		
		//jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		//jse.executeScript("var inputBox = document.getElementsByName('q')[0];inputBox.value = 'Arun Motoori';");
		//jse.executeScript("document.getElementById('alert1').click();");
		
		WebElement alertButton = driver.findElement(By.id("alert1"));
		
		jse.executeScript("arguments[0].click();",alertButton);

	}

}
