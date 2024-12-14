package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_006_KnowledgeSets extends BaseClass {
  @Test
  public void tc_006_Verify_Courses_link() throws Exception {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on 3 dots of Adriele test
		driver.findElement(By.xpath("(//td//i[@class='material-icons-outlined'])[2]")).click();
		
		// Click on Courses from the popup
				driver.findElement(By.xpath("(//p[@class='_d17jlg'])[2]")).click();
				
				// Assertion - courses 
				WebElement courses = driver.findElement(By.xpath("(//li[@class='MuiBreadcrumbs-li'])[3]"));
				Assert.assertEquals(courses.isDisplayed(), true);

  }
}
