package testcases_Dashboard;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_017 extends BaseClass{
  @Test
  public void tc_017_Recurrence_filter() {
	  
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
	  
	  // find element for Recurrence(halfyear) filter
	   driver.findElement(By.xpath("//input[@placeholder=\"Recurrence\"][\"HALFYEAR\"] "));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	   // find element for apply button
	   driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();
	   
	   //find element for recurrence assertion
	   WebElement RecurrenceHALFYEAR = driver.findElement(By.xpath("(//div[@class='_13hqe44'])[1]"));
	   Assert.assertEquals(RecurrenceHALFYEAR.isDisplayed(), true);
	  
  }
}
