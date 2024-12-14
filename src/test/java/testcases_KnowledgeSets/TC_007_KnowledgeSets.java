package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_007_KnowledgeSets extends BaseClass {
  @Test
  public void tc_007_Verify_Explorebutton() throws Exception {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on 3 dots of software testing
		driver.findElement(By.xpath("(//div[@class='_aus38o'])[4]")).click();
		
		// Click on Courses from the popup
				driver.findElement(By.xpath("(//div[@class='_12kvah7'])[2]")).click();
				
				//click on 3 dots of knowledge set
				driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
				
				// click on explore button
				driver.findElement(By.xpath("//div[@class='_12kvah7']")).click();
				
				//Assertion
				WebElement Detailstab = driver.findElement(By.xpath("//p[@class='_1gubmjby']"));
				Assert.assertEquals(Detailstab.isDisplayed(), true);
  }
}
