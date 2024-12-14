package testcases_Courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_006_Courses extends BaseClass{
	
	
  @Test
  public void tc_006_Library_3dots() {
	  
		Login();


		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// find element for library button
		driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

		// find element for 3 dots in Library section
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();
		
		// find element for popup window
		WebElement popupwindow = driver.findElement(By.xpath("(//div[@class='MuiPaper-root MuiPopover-paper _1s0g7xi MuiPaper-elevation8 MuiPaper-rounded'])[1]"));
		Assert.assertEquals(popupwindow.isDisplayed(), true);

  }
}
