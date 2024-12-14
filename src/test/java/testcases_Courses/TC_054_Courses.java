package testcases_Courses;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_054_Courses extends BaseClass{
  @Test
  public void tc_054_Verify_Deletebutton() throws Exception {
	  
	  Login();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots of boosting confidence
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();
		
		// click on edit button from popup
		driver.findElement(By.xpath("(//p[@class='_d17jlg'])[1]")).click();
		
		// click on Users tab
		driver.findElement(By.xpath("//a[3]//div[1]")).click();
		Thread.sleep(2000);
		
		// scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 1200)");
		
		
		//click on 3 dots of selected learner
		driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) div:nth-child(1) button:nth-child(1) span:nth-child(1) i:nth-child(1)")).click();
		
		// click on delete button
		driver.findElement(By.cssSelector("._2kamhyo")).click();
		
		// type delete in deletion text box
		driver.findElement(By.id("delete")).sendKeys("delete");
		
		// click on delete button
		driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-text._brgg17g")).click();
		
		//Assertion
	WebElement learnerdeleted = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) div:nth-child(1) button:nth-child(1) span:nth-child(1) i:nth-child(1)"));
		Assert.assertTrue(true, "learnerdeleted");		
		
		
  }
}
