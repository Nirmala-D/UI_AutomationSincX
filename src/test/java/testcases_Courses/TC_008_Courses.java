package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_008_Courses extends BaseClass{
	
  @Test
  public void tc_008_Verify_Usethiscourse_button() {
	  
	  Login();
	  
	// find element for Courses option
				driver.findElement(By.cssSelector("div[class='_1evjhr3'] div:nth-child(2) div:nth-child(1) div:nth-child(2)"))
						.click();

				// find element for library button
				driver.findElement(By.xpath("//p[normalize-space()='Library']")).click();

				// find element for 3 dots in Library section
				driver.findElement(By.xpath("((//i[contains(text(),'more_vert')])[1]")).click();
						
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				// Click on "Use this course" button
				driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();
				
				//click on save button
				driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
				
				// verity message
				WebElement Thiscoursehasbeenalreadyaddedoncetoyourlibrary = driver.findElement(By.xpath("//p[@class=\"_pegdp\"]"));
				Assert.assertEquals(Thiscoursehasbeenalreadyaddedoncetoyourlibrary.isDisplayed(), true);
	  
  }
}
