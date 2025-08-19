package handlingcalendarpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String expectedDay = "15";
		String expectedMonth = "March";
		String expectedYear = "2027";
		
		String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String dayXPath = "//td[@data-handler='selectDay']/a[text()='"+expectedDay+"']";
		
		driver.findElement(By.xpath(dayXPath)).click();
		
	}

}
