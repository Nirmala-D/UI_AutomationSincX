package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_012 extends BaseClass{
	
	@Test
  public void tc_012() {
	  
	  // enter domain name
	  driver.findElement(By.xpath("//input[@placeholder=\"Enter your domain\"]")).sendKeys("busyqa.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  //find element for Email
	  WebElement Email = driver.findElement(By.xpath("//p[@class=\"_1dicgei\"]"));
	  Assert.assertEquals(Email.isDisplayed(), true);
  }
}
