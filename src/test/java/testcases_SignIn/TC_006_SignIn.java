package testcases_SignIn;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_006_SignIn extends BaseClass{
	
  @Test
  public void tc_006() {
	// enter domain name
		  driver.findElement(By.id("domainName")).sendKeys("busyqa.com");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		   
		  // Leave email field as blank
		  driver.findElement(By.id("userName")).sendKeys(" ");
		  
		  // click on the continue button
		  driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();
		  
		  //find element for error message
		  WebElement Enteryouremail = driver.findElement(By.xpath("//div[@class='MuiSnackbarContent-message _1eri0dc']"));
		  Assert.assertEquals(Enteryouremail.isDisplayed(), true);
  }
}
