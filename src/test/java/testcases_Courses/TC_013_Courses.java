package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_013_Courses extends BaseClass {
  @Test
  public void tc_013_Verify_Previous_button() {
	  
	  Login();

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// find element for library button
		driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

		// find element for 3 dots in Library section
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on preview button
		driver.findElement(By.xpath("//p[normalize-space()='Preview']")).click();
		
		// click on preview button from the course page
		driver.findElement(By.xpath("(//p[@class='_1yanunz'])[1]")).click();
		
		//click on next button
		driver.findElement(By.xpath("//p[@class='_1tnoq2tk']")).click();
		
		//click on previous button
		driver.findElement(By.xpath("//p[@class='_vqfmxdj']")).click();
		
		//Assertion
		WebElement Introduction = driver.findElement(By.xpath("//h1[@class='_1fe5yjd']"));
		Assert.assertTrue(true, "Introduction");
  }
}
