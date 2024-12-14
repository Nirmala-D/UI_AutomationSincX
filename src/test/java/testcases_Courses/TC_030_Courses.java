package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_030_Courses extends BaseClass{
  @Test
  public void tc_030_Verify_AddFAQ() {
	  
	  Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[42]")).click();
		
		// click on edit button from popup window
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();
		
		//click on the FAQ tab
		driver.findElement(By.xpath("(//a[@class='_q9xnxf'])[5]")).click();
		
		// click on the add button
		driver.findElement(By.xpath("//p[@class='_gkprm7']")).click();
		
		// find element for title text box
		driver.findElement(By.xpath("(//input[@id='title'])[1]")).sendKeys("gui");
		
		// find element for display order
		driver.findElement(By.xpath("//input[@id='order']")).sendKeys("001");
		
		//find element for description text box
		driver.findElement(By.xpath("//textarea[@id='descr']")).sendKeys("Graphical User Interface");
		
		// click on save button
		driver.findElement(By.xpath("//p[normalize-space()='Save']")).click();
		
		//find element for Add FAQ
		WebElement AddedFAQ = driver.findElement(By.xpath("//table[@class='MuiTable-root _nzyk8q']"));
		Assert.assertEquals(AddedFAQ.isDisplayed(), true);
  }
}
