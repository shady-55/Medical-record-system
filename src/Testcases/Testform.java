package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Testform {	
	static WebDriver driver = null;
	@BeforeTest
	public void Setup() {

		System.setProperty("webdriver.gecko.driver","D:\\Tessting\\geckodriver.exe");
		driver=new FirefoxDriver();
		String Url="https://demo.openmrs.org/openmrs/login.htm";
		driver.get(Url); 
	}

	@AfterTest
	public void teardown() {

		driver.close(); 


	}  

}
