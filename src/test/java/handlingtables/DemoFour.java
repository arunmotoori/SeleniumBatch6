package handlingtables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoFour {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/admin");
		
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-close")));
		closeButton.click();
		
		driver.findElement(By.id("menu-sale")).click();
		
		WebElement orders = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[contains(text(),'Orders')]")));
		orders.click();
		
		List<WebElement> customers = driver.findElements(By.xpath("//form[@id='form-order']//tr/td[4]"));
		
		for(int i=0;i<customers.size();i++) {
			
			String customerName = customers.get(i).getText();
			System.out.println(customerName);
			
			if(customerName.equals("Arun Motoori")) {
				
				String xpathText = "//form[@id='form-order']//tr["+(i+1)+"]/td[1]";
				driver.findElement(By.xpath(xpathText)).click();
				//break;
				
			}
			
		}

	}

}
