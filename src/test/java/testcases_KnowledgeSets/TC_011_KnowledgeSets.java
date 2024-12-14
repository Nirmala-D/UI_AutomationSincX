package testcases_KnowledgeSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_011_KnowledgeSets extends BaseClass {
  @Test
  public void tc_011_Verify_Home_button() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on home button
		driver.findElement(By.xpath("(//li[@class='MuiBreadcrumbs-li'])[1]")).click();
		
		//Assertion to check user land on the dashboard
		WebElement dashboard = driver.findElement(By.xpath("//p[@class='_1lkhsvcy']"));
		Assert.assertEquals(dashboard.isDisplayed(), true);
  }
}
