package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_042_Courses extends BaseClass{
  @Test
  public void tc_042_Verify_Logout_Button() {
	  
Login();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

      // Find element for Courses option
      driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
      
      // click on setting button
      driver.findElement(By.xpath("//div[@title='Settings']")).click();
      
      // click on logout link
      driver.findElement(By.xpath("(//p[@class='_15mrbxk'])[3]")).click();
      
      // find element for image
      WebElement LoginBackgroundimage = driver.findElement(By.xpath("//img[@alt='Login background image alt']"));
      Assert.assertEquals(LoginBackgroundimage.isDisplayed(), true);
      
      // found base url
      String baseURL = driver.getTitle();
      Assert.assertTrue(true);
  }
}
