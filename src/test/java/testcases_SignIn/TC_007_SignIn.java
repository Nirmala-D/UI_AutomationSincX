package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_007_SignIn extends BaseClass{
  @Test
  public void tc_007() {
	  
	  // enter domain name
	  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	   
	  // enter valid email "nirmaladeekonda2015@gmail.com"
	  driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  // enter valid password as QAtest!@#123 in password field
	  driver.findElement(By.id("pword")).sendKeys("QAtest!@#123");
	  
	 // click on the Login button
		  driver.findElement(By.xpath("// p[@class=\"_1fnrmou\"]")).click();
		  
	// find webelement for Dashboard
	 WebElement dashboard = driver.findElement(By.xpath("//p[@class=\"_1lkhsvcy\"]"));
	 Assert.assertEquals(dashboard.isDisplayed(), true);
  }
}
