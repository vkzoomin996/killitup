package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyfile {
WebDriver driver;
 		
	public String readdatafrompf( String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/pro.properties");
		Properties prop= new Properties( );
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

 	}		
	}

