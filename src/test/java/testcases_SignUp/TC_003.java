package testcases_SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_003 extends BaseClass {
	
	
  @Test
  public void tc_003 () {
	  
	  // find element LogoImage for assertion
	  WebElement LogoImage = driver.findElement(By.xpath("(//img[@alt='Logo Image'])[2]"));
	  Assert.assertEquals(LogoImage.isDisplayed(),true);
	  driver.close();
	  
  }
}
