package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_016_SignIn extends BaseClass{
  @Test
  public void tc_016() {
	  
	  // click on "Terms of use" link
	  driver.findElement(By.xpath("//p[normalize-space()='Terms Of Use']")).click();
	  
	  // find element for Terms of use link
	  WebElement TermsofUse = driver.findElement(By.xpath("//h1[@class=\"_16pg94n\"]"));
	  
	  //Assert the Terms of use word present in the page
	  Assert.assertEquals(TermsofUse.isDisplayed(), true);
  }
}
