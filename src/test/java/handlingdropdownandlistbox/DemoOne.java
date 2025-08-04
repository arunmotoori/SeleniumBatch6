package handlingdropdownandlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		//select.selectByVisibleText("doc 3");
		//select.selectByIndex(2);
		//select.selectByValue("mno");
		
		boolean b = select.isMultiple();
		System.out.println(b);
		
		driver.quit();

	}

}
