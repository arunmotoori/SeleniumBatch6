package handlingcalendarpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSix {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		String expectedDay = "15";
		String expectedMonth = "Mar";
		String expectedYear = "2027";
		
		driver.findElement(By.id("third_date_picker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		WebElement monthDropdown = driver.findElement(By.className("ui-datepicker-month"));
		Select select = new Select(monthDropdown);
		select.selectByVisibleText(expectedMonth);
		WebElement yearDropdown = driver.findElement(By.className("ui-datepicker-year"));
		select = new Select(yearDropdown);
		select.selectByVisibleText(expectedYear);
		
		String dayXPath = "//td[@*='selectDay']/a[text()='"+expectedDay+"']";
		driver.findElement(By.xpath(dayXPath)).click();

	}

}
