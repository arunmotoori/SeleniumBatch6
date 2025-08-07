package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFour {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		
		String text1 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text1);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		
		String text2 = driver.findElement(By.id("content")).getText();
		System.out.println(text2);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		
		String text3 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text3);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		
		String text4 = driver.findElement(By.tagName("body")).getText();
		System.out.println(text4);
		
		driver.quit();

	}

}
