package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_014 extends BaseClass {
	
  @Test
  public void tc_014() {
	  
	       // enter domain name
		  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
		  //click on the start over button
		  driver.findElement(By.xpath("//a[@class=\"_1icmdf2\"][1]")).click();
		  
		  // find webelement for domain word
		  WebElement domain = driver.findElement(By.xpath("//p[@for=\"domain\"]"));
		  Assert.assertEquals(domain.isDisplayed(), true);
  }
}
