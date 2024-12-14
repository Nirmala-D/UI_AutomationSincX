package testcases_KnowledgeSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_013_KnowledgeSets extends BaseClass {
  @Test
  public void tc_013_Verify_LearnerMode_button() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		//click on Settings symbol
		driver.findElement(By.xpath("//i[normalize-space()='settings']")).click();
		
        // click on Learner mode from the popup
		driver.findElement(By.xpath("(//p[@class='_15mrbxk'])[2]")).click();
		
		//Assertion to check learner mode url
		WebElement Dashboard = driver.findElement(By.xpath("//p[@class='_1lkhsvcy']"));
		Assert.assertEquals(Dashboard.isDisplayed(), true);
		
  }
}
