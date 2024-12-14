package testcases_SignUp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_009 extends BaseClass {
	
	
  @Test
  public void tc_009() {
	  
	  
	  // click on "Terms of use" link
	  driver.findElement(By.xpath("//p[normalize-space()='Terms Of Use']")).click();
	  
	  WebElement TermsofUse = driver.findElement(By.xpath("//h1[@class=\"_16pg94n\"]"));
	  Assert.assertEquals(TermsofUse.isDisplayed(), true);
  }
}
