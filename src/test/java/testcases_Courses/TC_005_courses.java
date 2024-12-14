package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_005_courses extends BaseClass{
	
	
  @Test
  public void tc_005_librarybutton() {
	  
	  
	  Login();
	  
		// find element for profile option
				driver.findElement(By.xpath("(//p[@class='_1hx0zhz'][normalize-space()='Profile'])[1]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// find element for Admin mode link
				driver.findElement(By.xpath("//p[normalize-space()='Admin mode']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// find element for Courses option
				driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)")).click();
				
				// find element for library button
				driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();
				
				// Find element for Library tilte
				WebElement Librarytitle = driver.findElement(By.xpath("//h1[@class='_1tfolp8']"));
				Assert.assertEquals(Librarytitle.isDisplayed(), true);
  }
}
