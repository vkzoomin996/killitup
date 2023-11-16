package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.Propertyfile;

public class Chro extends BaseClass{
 	Propertyfile flib=new Propertyfile();
   	@Test()
	public void launch() throws Throwable {
		Thread.sleep(5000);
driver.manage().window().maximize();
String URL = flib.readdatafrompf("url");
driver.get(URL);
 	}
	
}
	


