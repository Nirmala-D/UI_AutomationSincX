package testcases_SignUp;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_006 extends BaseClass {
	
  @Test
  public void tc_006 () {
	  
	  // leave domain name filed as blank
	  driver.findElement(By.id("domainName")).sendKeys("  ");
	  
	  //click on the continue button
	  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
	  
	  //find element for error message "enter domain name" for assertion
	  WebElement Enterdomainname = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
	  
	  // Assert the error message - Enter domain name
	  Assert.assertEquals(Enterdomainname.isDisplayed(), true);
	  
  }
}
