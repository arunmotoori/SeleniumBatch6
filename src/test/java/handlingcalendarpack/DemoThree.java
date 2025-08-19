package handlingcalendarpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoThree {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		
		String expectedDay = "10";
		String expectedMonth = "March";
		String expectedYear = "2027";
		
		Thread.sleep(5000);
		
		WebElement dateField = driver.findElement(By.id("form-field-travel_comp_date"));
		dateField.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='flatpickr-calendar']")));

		String currentMonth = driver.findElement(By.className("cur-month")).getText().trim();
		
		while(!currentMonth.equals(expectedMonth)) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] svg")).click();
			Thread.sleep(1000);
			currentMonth = driver.findElement(By.className("cur-month")).getText().trim();
		}
		
		driver.findElement(By.xpath("//input[@class='numInput cur-year']")).clear();
		
		driver.findElement(By.xpath("//input[@class='numInput cur-year']")).sendKeys(expectedYear);
		
		String dayXPath = "//span[@class='flatpickr-day '][text()='"+expectedDay+"']";
		
		driver.findElement(By.xpath(dayXPath)).click();
		
	}

}
