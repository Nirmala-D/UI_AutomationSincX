package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_010 extends BaseClass{
	
	
  @Test
  public void tc_010() {
	  
	  // click on Privacy Policy
	  driver.findElement(By.xpath("//p[normalize-space()=\"Privacy Policy\"]")).click();
	  
	 WebElement Privacypolicy = driver.findElement(By.xpath("//h1[@class=\"_16pg94n\"]"));
	 Assert.assertEquals(Privacypolicy.isDisplayed(), true);
	  
  }
  
 
}
