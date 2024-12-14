package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_010_SignIn extends BaseClass {
  @Test
  public void tc_010() {
	  
	// enter domain name
			driver.findElement(By.id("domainName")).sendKeys("busyqa.com");

			// click on the continue button
			driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();

			// enter valid email "nirmaladeekonda2015@gmail.com"
			driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");
			
			// find element for Start over button
			driver.findElement(By.xpath("//p[normalize-space()='Start over']")).click();
			
			// find element for domain
			WebElement domain = driver.findElement(By.xpath("//p[@class=\"_1dicgei\"]"));
			Assert.assertEquals(domain.isDisplayed(), true);
  }
}
