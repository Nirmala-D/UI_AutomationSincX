package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_014_KnowledgeSets extends BaseClass{
  @Test
  public void tc_014_Logout_button() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		//click on Settings symbol
		driver.findElement(By.xpath("//i[normalize-space()='settings']")).click(); 
		
		//click on Logout button
		driver.findElement(By.xpath("(//p[@class='_15mrbxk'])[3]")).click();
		
		//Assertion to check user logout or not
		WebElement Domain = driver.findElement(By.xpath("//p[@class='_1dicgei']"));
		Assert.assertEquals(Domain.isDisplayed(), true);
  }
}
