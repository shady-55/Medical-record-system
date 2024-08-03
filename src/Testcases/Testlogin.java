package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testlogin extends Testform {
	
	 @Test
     public void testLogin() {
     	
     	WebElement username=driver.findElement(By.id("username"));
 		username.sendKeys("Admin");
 		
 		WebElement password=driver.findElement(By.id("password"));
 		password.sendKeys("Admin123");
 		
 		WebElement togglepassword=driver.findElement(By.id("togglePassword"));
 		togglepassword.click();
 		
 		WebElement session=driver.findElement(By.id("Inpatient Ward"));
 		session.click();
 		
 		WebElement login=driver.findElement(By.id("loginButton"));
 		login.click();
 		
 		String Expectedtitle="Home";
 		String Acttualtitle =driver.getTitle();
 		
 		Assert.assertEquals(Acttualtitle,Expectedtitle );
     	
     	
     }

}
