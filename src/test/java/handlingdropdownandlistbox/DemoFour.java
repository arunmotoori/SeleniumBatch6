package handlingdropdownandlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoFour {

	public static void main(String[] args) throws InterruptedException {
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//div[@class='dropdown']/a[text()='Select Product Type']")).click();
		driver.findElement(By.xpath("//li[text()='Accounts']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown']/a[text()='Select Product']")).click();
		driver.findElement(By.xpath("//li[text()='Current Accounts']")).click();
		
		driver.findElement(By.linkText("APPLY ONLINE")).click();

	}

}
