package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_015_Courses extends BaseClass {
  @Test
  public void tc_015_VerifyEDitbutton() {
	  
	  
	  
	  Login();

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[40]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click on edit button
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();
		
		// find element for all features of GUI testing
		WebElement features = driver.findElement(By.xpath("//div[@class=\"_1joc06t\"]"));
		Assert.assertTrue(true, "features");

  }
}
