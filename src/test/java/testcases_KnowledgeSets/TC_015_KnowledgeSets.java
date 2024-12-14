package testcases_KnowledgeSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_015_KnowledgeSets extends BaseClass{
  @Test
  public void tc_015_Verify_SincX_Logo() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on SincX logo
		driver.findElement(By.xpath("//img[@alt='Logo Image']")).click();
		
		//Assertion to check user lands on dashboard of admin mode
		WebElement dashboard = driver.findElement(By.xpath("//p[@class='_1lkhsvcy']"));
		Assert.assertEquals(dashboard.isDisplayed(), true);
  }
}
