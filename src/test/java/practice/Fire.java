package practice;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.Propertyfile;

public class Fire extends BaseClass {
	Propertyfile flib=new Propertyfile();
	@Test()
	public void launch() throws Throwable {
		Thread.sleep(5000);
		String URLL = flib.readdatafrompf("urll");
		driver.manage().window().maximize();
		driver.get(URLL);
 	
	}
	
}

