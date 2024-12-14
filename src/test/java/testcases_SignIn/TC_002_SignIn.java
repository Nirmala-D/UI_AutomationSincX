package testcases_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_002_SignIn extends BaseClass{
  @Test
  public void tc_002_Invalidomainname() {
	  
	// enter invalid domain name
		  driver.findElement(By.id("domainName")).sendKeys("busy.com");
		  //click on continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
		  // find element for This domain is not enabled for assertion
		  WebElement Thisdomainisnotenabled = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Thisdomainisnotenabled.isDisplayed(), true);
	  
	  
  }
}
