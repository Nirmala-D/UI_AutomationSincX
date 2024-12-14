package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_036_Courses extends BaseClass{
  @Test
  public void tc_036_Verify_Homebutton() {
	  
Login();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      // Find element for Courses option
      driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
      
      // click on 3 dots next to the Work-life balance
      driver.findElement(By.xpath("(//i[@class='material-icons-outlined'][normalize-space()='more_vert'])[1]")).click();
      
      // click on Edit link
      driver.findElement(By.xpath("//a[@class='_gozzbg']")).click();
      
      // click on home link
      driver.findElement(By.xpath("(//li[@class='MuiBreadcrumbs-li'])[1]")).click();
      
      //find element for dashboard
      WebElement dashboard = driver.findElement(By.xpath("(//div[@class='_bfbtmj'])[1]"));
      Assert.assertEquals(dashboard.isDisplayed(), true);
      
  
  }
}
