package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_017_SignIn extends BaseClass{
  @Test
  public void tc_017() {
	  
	// click on Privacy Policy
		  driver.findElement(By.xpath("//p[normalize-space()=\"Privacy Policy\"]")).click();
		  
		 WebElement Privacypolicy = driver.findElement(By.xpath("//h1[@class=\"_16pg94n\"]"));
		 Assert.assertEquals(Privacypolicy.isDisplayed(), true);
  }
}
