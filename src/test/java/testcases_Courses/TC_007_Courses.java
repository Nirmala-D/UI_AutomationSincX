package testcases_Courses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_007_Courses extends BaseClass{
	
	
  @Test
  public void tc_007_verifyPreviewbutton() {
	  
	  Login();
	  
	  
	// find element for Courses option
			driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)"))
					.click();

			// find element for library button
			driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

			// find element for 3 dots in Library section
			driver.findElement(By.xpath("(//i[@class='material-icons-outlined'][normalize-space()='more_vert'])[2"))
					.click();
			
			//find element for popup window and verify preview button
			WebElement previewbutton = driver.findElement(By.xpath("(//div[@class='MuiPaper-root MuiPopover-paper _1s0g7xi MuiPaper-elevation8 MuiPaper-rounded'])[1]"));
			Assert.assertEquals(previewbutton.isDisplayed(), false);
  }
}
