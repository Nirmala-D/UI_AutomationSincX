package testcases_KnowledgeSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_012_KnowledgeSets extends BaseClass{
  @Test
  public void tc_012_Verify_Settings_Symbol() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		//click on Settings symbol
		driver.findElement(By.xpath("//i[normalize-space()='settings']")).click();
		
		//Assertion to check for popup window with logout & Learner mode buttons
		WebElement popup_window = driver.findElement(By.xpath("//div[@class='_e2rpdg']"));
		Assert.assertEquals(popup_window.isDisplayed(), true);
  } 
}
