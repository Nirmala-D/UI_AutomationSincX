package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_010_Courses extends BaseClass{
  @Test
  public void tc_010_VerifyPreviewbutton1() {
	  
	  
	  Login();

		// click on Courses option
		driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)"))
				.click();

		// click on library button
		driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

		// click on 3 dots in Library section
		driver.findElement(By.xpath("((//i[contains(text(),'more_vert')])[1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on preview button
		driver.findElement(By.xpath("//p[normalize-space()='Preview']")).click();
	  
	  
	  // click on preview button in the course page
	  driver.findElement(By.xpath("(//p[@class='_1yanunz'])[1]")).click();
	  
	  // find element for word "Introduction" for assertion
	  WebElement Introduction = driver.findElement(By.xpath("//h1[@class=\"_1fe5yjd\"]"));
	  Assert.assertEquals(Introduction.isDisplayed(), true);
	  
	  
  }
}
