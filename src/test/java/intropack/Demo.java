package intropack;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();

	}

}
