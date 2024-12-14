package testcases_Dashboard;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_011 extends BaseClass{
  @Test
  public void tc_011_Library_filter() {
	  
	  Login();
 
	  
	  // find element for sort/filer
	  driver.findElement(By.xpath("//div[@class=\"_c77kua\"]")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  // click on Library(NO) filter
	  WebElement inputElement = driver.findElement(By.xpath("//input[@placeholder=\"From library\"]"));
      inputElement.sendKeys("NO");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // find element for apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();
	  
	  
	  // find element for Library(NO)
	   WebElement FromLibraryNO = driver.findElement(By.xpath("//div[@class=\"_mecsd2\"]"));
	   Assert.assertEquals(FromLibraryNO.isDisplayed(), true);
	  
	 
	 
	  
  }
}
