package testcases_Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_004 extends BaseClass{
  @Test
  public void tc_004() {
	  
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
	  
	  // find element for Group filter (ST BATCH1)
	  WebElement inputElement = driver.findElement(By.xpath("//input[@placeholder=\"Group\"][\"ST BATCH 1\"]"));
      //inputElement.sendKeys("NO");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // find element for apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz']")).click();
	   
	   //find element for group assertion (ST BATCH1)
	   WebElement STBATCH1 = driver.findElement(By.xpath("//div[@class=\"_13hqe44\"]"));
	   Assert.assertEquals(STBATCH1.isDisplayed(), true);
	   
  }
}
