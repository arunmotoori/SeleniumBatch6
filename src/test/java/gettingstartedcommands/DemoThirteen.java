package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThirteen {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String buttonOneText = driver.findElement(By.id("button9")).getText();
		System.out.println(buttonOneText);
		
		String buttonLabel = driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[2]/input ")).getAttribute("value");
		System.out.println(buttonLabel);
		
		String heightOfImage = driver.findElement(By.xpath("//div[@id='HTML29']//img")).getAttribute("height");
		System.out.println(heightOfImage);
		
		driver.quit();

	}

}
