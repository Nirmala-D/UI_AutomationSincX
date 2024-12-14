package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_048_Courses extends BaseClass{
  @Test
  public void tc_048_Verify_PreviewTab() throws Exception {
	   Login();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots of boosting confidence
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();
		
		// click on edit button from popup
		driver.findElement(By.cssSelector("._d17jlg")).click();
		
		// click on preview tab
		driver.findElement(By.xpath("(//p[@class='_1qr5fe8'])[1]")).click();
		Thread.sleep(2000);
		
		// scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 900)");
		
		//Assertion
		WebElement CoursePreview = driver.findElement(By.xpath("//div[@class='_1f8piof']"));
		Assert.assertEquals(CoursePreview.isDisplayed(), true);
		
		
	  
  }
}
