package testcases_SignUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_020 extends BaseClass {
	
  @Test
  public void tc_020() {
	  
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
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  
	   // find element for error message
		  WebElement Usernameorpasswordiswrong = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		  Assert.assertEquals(Usernameorpasswordiswrong.isDisplayed(), true);
  }
}
