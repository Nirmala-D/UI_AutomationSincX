package testcases_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_008_SignIn extends BaseClass {
  @Test
  public void TC_008() {
	  
	  // enter domain name
	  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	   
	  // enter valid email "nirmaladeekonda2015@gmail.com"
	  driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");
	  
	  // click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  // enter invalid password as 1234!@#35 in password field
	  driver.findElement(By.id("pword")).sendKeys("1234!@#35");
	  
	 // click on the Login button
		  driver.findElement(By.xpath("// p[@class=\"_1fnrmou\"]")).click();
		  
		  
	   // find element for error message
		  WebElement Usernameorpasswordiswrong = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Usernameorpasswordiswrong.isDisplayed(), true);
  }
}
