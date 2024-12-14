package testcases_SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_017 extends BaseClass {
	
  @Test
  public void tc_017() {
	  
	  	  // enter domain name
		  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		   
		  // enter invalid email "1234567"
		  driver.findElement(By.id("userName")).sendKeys("1234567");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
		  // find element for error message
		  WebElement Invalidemail = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Invalidemail.isDisplayed(), true);
		  
	  
  }
}
