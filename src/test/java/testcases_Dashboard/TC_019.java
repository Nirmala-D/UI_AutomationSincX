package testcases_Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_019 extends BaseClass{
  @Test
  public void TC_019() {
	  
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
	  
	  // find element for Assessment filter
	  WebElement inputElement = driver.findElement(By.xpath("//input[@placeholder=\"Assessment\"]"));
      inputElement.sendKeys("YES");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // find element for apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();
	   
	   // find element for Assessment YES filter
	   WebElement AssessmentYES = driver.findElement(By.xpath("//div[@class=\"_mecsd2\"]"));
	   Assert.assertEquals(AssessmentYES.isDisplayed(), true);
  }
}
