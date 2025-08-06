package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		String pageHeading = driver.findElement(By.tagName("h1")).getText();
		System.out.println(pageHeading);
		
		driver.switchTo().frame("firstFr");
		
		String sectionHeading = driver.findElement(By.tagName("h1")).getText();
		System.out.println(sectionHeading);
		
		driver.findElement(By.name("fname")).sendKeys("Arun");
		driver.findElement(By.name("lname")).sendKeys("Motoori");
		
		WebElement childFramework = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		driver.switchTo().frame(childFramework);
		
		driver.findElement(By.name("email")).sendKeys("arun.motoori@gmail.com");
		
		driver.findElement(By.name("email")).clear();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("fname")).clear();
		
		driver.switchTo().defaultContent();
		
		pageHeading = driver.findElement(By.tagName("h1")).getText();
		System.out.println(pageHeading);
		
		//driver.quit();

	}

}
