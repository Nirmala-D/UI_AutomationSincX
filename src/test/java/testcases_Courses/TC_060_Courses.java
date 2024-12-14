package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_060_Courses extends BaseClass {
  @Test
  public void tc_060_Verify_Scrollbar() throws Exception {
	  
	  
	  Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
  
	  // click on 3 dots of worklife balance course
	  driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();
	  
	  // click on edit from the popup
	  driver.findElement(By.xpath("(//p[@class='_d17jlg'])[1]")).click();
	  
	  //click on users button
	  driver.findElement(By.xpath("(//p[@class='_1qr5fe8'][normalize-space()='Users'])[1]")).click();
	  Thread.sleep(3000);
	  
	// Scroll down webpage
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 600)");
      Thread.sleep(3000);
      
   // Scroll down webpage
      JavascriptExecutor js1 = (JavascriptExecutor) driver;
      js1.executeScript("window.scrollBy(0, -300)");
      
      // Assertion (Authors)
      WebElement Authors = driver.findElement(By.xpath("(//h2[@class='_15eh28o'])[2]"));
      Assert.assertEquals(Authors.isDisplayed(), true);
  }
}
