package testcases_Courses;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_003_Courses extends BaseClass{
	
	
  @Test
  public void tc_003_3dots() {
	  
	  Login();
	  
		
		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// find element for 3 dots
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		// find element for Edit  and delete popup
		WebElement popup = driver.findElement(By.cssSelector(".MuiPaper-root.MuiPopover-paper._1s0g7xi.MuiPaper-elevation8.MuiPaper-rounded"));
		Assert.assertTrue(true);
  }
}
