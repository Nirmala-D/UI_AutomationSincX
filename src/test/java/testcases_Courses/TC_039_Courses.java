package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_039_Courses extends BaseClass{
  @Test
  public void tc_039_Verify_Delete_button() {
	  
Login();
	  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

      // Find element for Courses option
      driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
      
      // click on 3 dots next to the 10th course (Jira)	
      driver.findElement(By.xpath("(//i[@class='material-icons-outlined'][normalize-space()='more_vert'])[10]")).click();
      
      // click on delete button
      driver.findElement(By.xpath("//p[@class=\"_2kamhyo\"]")).click();
      
      //click on the deletion text box
      driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("delete");
      
      // click on delete button
      driver.findElement(By.xpath("(//p[@class='_gkprm7'])[4]")).click();
      
      //find element for replaced 10th course (managing stress)
      WebElement replaced_10th_Course = driver.findElement(By.xpath("(//tr[@class='MuiTableRow-root'])[10]"));
      Assert.assertEquals(replaced_10th_Course.isDisplayed(), true);
      
  }
}
