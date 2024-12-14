package Stbatch1.Sincxadmin;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class Testcases_Signup extends BaseClass{
	
  @Test
  public void TC_001() {
	  
	  WebElement LogoImage = driver.findElement(By.xpath("(//img[@alt='Logo Image'])[2]"));
	  Assert.assertEquals(LogoImage.isDisplayed(), true);
	 
  }
}
