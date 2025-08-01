package handlingpopusnotificationsdialogspack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoFour {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=47&search=hp");
		
		driver.findElement(By.xpath("(//img[@title='HP LP3065'])[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='×']")));

		Thread.sleep(2000);
		
		closeButton.click();
		
		
	}

}
