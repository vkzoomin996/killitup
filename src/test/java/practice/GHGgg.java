package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GHGgg {
 	@Test()
	public void launch() throws Throwable {
 		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
 		WebDriver driver =new ChromeDriver();
 		driver.get("https://github.com/dashboard");
 	}
}
