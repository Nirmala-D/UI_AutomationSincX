package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_004_Courses extends BaseClass{
  @Test
  public void TC_004_Homebutton() {
	  
	  Login();
	  
	// find element for profile option
			driver.findElement(By.xpath("(//p[@class='_1hx0zhz'][normalize-space()='Profile'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// find element for Admin mode link
			driver.findElement(By.xpath("//p[normalize-space()='Admin mode']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			// find element for Courses option
			driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)")).click();
			
			// find element for home button
			driver.findElement(By.xpath("//li[@class=\"MuiBreadcrumbs-li\"][1]")).click();
			
			//find element for dashboard option
			WebElement dashboard = driver.findElement(By.xpath("//p[@class=\"_1lkhsvcy\"]"));
			Assert.assertEquals(true, dashboard.isDisplayed());
			
  }
}
