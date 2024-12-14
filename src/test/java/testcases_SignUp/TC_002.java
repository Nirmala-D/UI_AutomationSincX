package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_002 extends BaseClass {
	
  @Test 
  public void tc_002() {
	  
	  // enter domain name
	  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
	  //click on continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  // find element for Hello word for assertion
	  WebElement Hello = driver.findElement(By.xpath("//p[@class='_pxo6mo']"));
	  Assert.assertEquals(Hello.isDisplayed(), true);
	  
}
  
}