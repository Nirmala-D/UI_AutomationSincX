package testcases_SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_001 extends BaseClass {
	
	
  @Test 
  public void tc_001 () {
	  
	  
	  //WebElement EmployeetrainingSimplified = driver.findElement(By.xpath("(//p[@class=\"_4phl65\"]")); 
	  //Assert.assertEquals(EmployeetrainingSimplified.isDisplayed(),true);
	  
	  WebElement LogoImage = driver.findElement(By.xpath("(//img[@alt='Logo Image'])[2]"));
	  Assert.assertEquals(LogoImage.isDisplayed(), true);
	 
  }
  
}
