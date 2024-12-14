package testcases_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_005_SignIn extends BaseClass{
  @Test
  public void tc_005_InvalidEmail() {
	  
	// enter domain name
		  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		   
		  // enter invalid email "!@#$%^&"
		  driver.findElement(By.id("userName")).sendKeys("!@#$%^&");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
		  // find element for error message
		  WebElement Invalidemail = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Invalidemail.isDisplayed(), true);
		  
  }
}
