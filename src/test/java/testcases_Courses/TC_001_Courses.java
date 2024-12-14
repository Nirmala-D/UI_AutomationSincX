package testcases_Courses;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import base.BaseClass;

public class TC_001_Courses extends BaseClass{
	
	
  @Test
  public void tc_001_CoursesTitle() {
	  
	  Login();
	  
	  
	  
	  //find element for Courses option
	  driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)")).click();
	  
	  File ScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  //Files.copyfile((ScreenshotFile).newfile("\C:\\Users\\bujji\\OneDrive\\")));
	  
	  // find element for courses title
	  WebElement Courses = driver.findElement(By.xpath("//h1[@class=\"_1tfolp8\"]"));
	  Assert.assertEquals(Courses.isDisplayed(), true); 
	  
	  }
	  
	 
}
