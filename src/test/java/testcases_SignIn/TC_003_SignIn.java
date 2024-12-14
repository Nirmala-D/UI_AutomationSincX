package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_003_SignIn extends BaseClass{
  @Test
  public void tc_003() {
	  
	// leave domain name filed as blank
		  driver.findElement(By.id("domainName")).sendKeys("  ");
		  
   //click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
  //find element for This domain name not enabled
		  WebElement Thisdomainnamenotenabled = driver.findElement(By.xpath("//div[@class=\"MuiSnackbarContent-message _1eri0dc\"]"));
		  Assert.assertEquals(Thisdomainnamenotenabled.isDisplayed(), true);
		  
  
  }
}
