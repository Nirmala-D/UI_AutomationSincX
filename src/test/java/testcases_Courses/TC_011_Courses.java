package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_011_Courses extends BaseClass{
  @Test
  public void tc_011_VerifyBackbutton() {
	  
	  Login();

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for library button
		driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

		// click on 3 dots next to the work place safety in Library section
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on preview button
		driver.findElement(By.xpath("//p[normalize-space()='Preview']")).click();
		
		// click on preview link
		//driver.findElement(By.xpath("//p[@class='_1yanunz']")).click();
	  
		// Click on back button
		driver.findElement(By.xpath("//p[@class='_1tog7ov']")).click();
		
		//find element for course title
		WebElement WorkplaceSafety = driver.findElement(By.xpath("//h1[@class='_1tfolp8']"));
		Assert.assertEquals(WorkplaceSafety.isDisplayed(), true);
  }
}
