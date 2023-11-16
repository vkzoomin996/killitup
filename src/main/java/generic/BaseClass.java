package generic;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
 
import io.github.bonigarcia.wdm.WebDriverManager;

 
public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sdriver;

	
	 Propertyfile  	rf =new Propertyfile();
	 
	@BeforeSuite
	public void bsconfig() {
		// to connect with database
		System.out.println("connect to data base");

	}
	@Parameters("BROWSER")
  	@BeforeClass
	public void bcconfig() throws Throwable {
 		String Browser = rf.readdatafrompf("browser");
	if(Browser.equalsIgnoreCase("chrome")) {
  	 		WebDriverManager.chromedriver().setup();
 	 		driver = new ChromeDriver();
 	 		}
		else  {
 
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
 		

} 
	}

 	
	@BeforeMethod
	public void bmconfig() {
		// login to app
	}

	@AfterMethod
	public void amconfig() {
//logout to application

	}

	@AfterClass
	public void acconfig() {
		driver.close();

	}

	@AfterSuite
	public void asconfig() {
		// disconnected with database
	}

}
