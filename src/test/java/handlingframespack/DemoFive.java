package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.findElement(By.cssSelector("div[aria-label='Close'] svg")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		
		

	}

}
