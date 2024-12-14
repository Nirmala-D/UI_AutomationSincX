package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_001_SignIn extends BaseClass{
  @Test
  public void tc_001() {
	  
	  // enter domain name
	  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
	  
	  //click on continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  // find element for Email word
	  WebElement Email = driver.findElement(By.xpath("//p[@class=\"_1dicgei\"]"));
	  Assert.assertEquals(Email.isDisplayed(), true);
	  
	  
  }
}
