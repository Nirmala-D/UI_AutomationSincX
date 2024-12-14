package testcases_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_009_SignIn extends BaseClass{
  @Test
  public void tc_009() {
	  
	// enter domain name
	  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	   
	  // enter valid email "nirmaladeekonda2015@gmail.com"
	  driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  //leave password field as blank
	  driver.findElement(By.id("pword")).sendKeys("");
	  
	 // click on the Login button
		  driver.findElement(By.xpath("// p[@class=\"_1fnrmou\"]")).click();
		  
		  
	   // find element for error message
		  WebElement Enteryourpassword = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Enteryourpassword.isDisplayed(), true);
	  
  }
}
