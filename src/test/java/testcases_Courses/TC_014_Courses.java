package testcases_Courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_014_Courses extends BaseClass{
  @Test
  public void tc_014_Verify_ADD_Button() {
	  
	  
	  Login();

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

	  
	  // click on ADD button
	  driver.findElement(By.xpath("(//p[normalize-space()='Add'])[1]")).click();
	  
	  // type Gui testing in test box
	  driver.findElement(By.id("title")).sendKeys("GUI Testing");
	  
	  // click on save button
	  driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]")).click();
	  
	  
	 // find element for added new course GUI Testing
	 WebElement courseadded = driver.findElement(By.xpath("(//div)[108]"));
	 Assert.assertEquals("courseadded", true);
  }
}
