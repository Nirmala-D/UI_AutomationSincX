package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_011_SignIn extends BaseClass {
  @Test
  public void tc_011() {
	  
	// enter domain name
		  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		   
		  // enter valid email "nirmaladeekonda2015@gmail.com"
		  driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		    
	  // find element for reset password
	  driver.findElement(By.xpath("(//a[@class='_1icmdf2'])[1]")).click();
	  
	  // find element for Get OTP
	  WebElement GetOTP = driver.findElement(By.xpath("//p[@class=\"_1fnrmou\"]"));
	  Assert.assertEquals(GetOTP.isDisplayed(), true);
  }
}
