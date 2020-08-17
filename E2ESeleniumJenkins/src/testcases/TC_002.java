package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("hello1");
		driver.quit();
	}
	
}
