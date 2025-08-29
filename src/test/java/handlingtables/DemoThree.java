package handlingtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		int rowCount = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='table1']//th")).size();
		
		for(int r=1;r<=rowCount;r++) {
			
			for(int c=1;c<=colCount;c++) {
				
				String xpathText;
				
				if(r==1) {
					xpathText = "//table[@id='table1']//tr["+r+"]/th["+c+"]";
				}else {
					xpathText = "//table[@id='table1']//tr["+(r-1)+"]/td["+c+"]";
				}
				
				String elementText = driver.findElement(By.xpath(xpathText)).getText();
				System.out.print(elementText+" ");
				
			}
			
			System.out.println();
			
		}
		
		driver.quit();
	}

}
