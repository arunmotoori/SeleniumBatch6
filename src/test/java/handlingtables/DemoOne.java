package handlingtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//th"));
//		List<WebElement> datas = driver.findElements(By.xpath("//table[@id='table1']//td"));
//		
//		for(WebElement data : datas) {
//			System.out.println(data.getText());
//		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		int rowCount = rows.size();
		
		System.out.println(rowCount);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		int columnCount = columns.size();
		
		System.out.println(columnCount);
		
		driver.quit();

	}

}
