package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_011 extends BaseClass {
	
  @Test
  public void tc_011() {
	  
	  
	  // click on Terms & Conditions
	  driver.findElement(By.xpath("//p[normalize-space()=\"Terms & Conditions\"]")).click();
	  
	  // find element for Terms and conditions
	  WebElement TermsandConditions = driver.findElement(By.xpath("//h1[@class=\"_16pg94n\"]"));
	  Assert.assertEquals(TermsandConditions.isDisplayed(), true);
}
}