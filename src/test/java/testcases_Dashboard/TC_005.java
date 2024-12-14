package testcases_Dashboard;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_005 extends BaseClass{
  @Test
  public void tc_005_filter() {
	  
	  Login();
	  
	  // find element for profile option
	  driver.findElement(By.xpath("(//p[@class='_1hx0zhz'][normalize-space()='Profile'])[1]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // find element for Admin mode link
	  driver.findElement(By.xpath("//p[normalize-space()='Admin mode']")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 
	  
	  // find element for sort/filer
	  driver.findElement(By.xpath("//div[@class=\"_c77kua\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // find element for Course Status (LIVE)
	  WebElement inputElement = driver.findElement(By.xpath("//input[@placeholder=\"Course status\"]"));
      inputElement.sendKeys("LIVE");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // find element for apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();
	  
	   //Assertion for course status LIVE pop-up button
	   WebElement CoursestatusLIVE = driver.findElement(By.xpath("//div[@class=\"_13hqe44\"]"));
	   Assert.assertSame("CoursestatusLIVE", true);
	     }
}
