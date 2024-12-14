package testcases_KnowledgeSets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_008_KnowledgeSets extends BaseClass{
  @Test
  public void tc_008_Verify_Knowledgesets_button() throws Exception {
	  
	  
		Login();
		Thread.sleep(2000);

		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();

		// click on 3 dots of Adriele test1
		driver.findElement(By.xpath("(//div[@class='_aus38o'])[8]")).click();
		
		// Click on Courses from the popup
		driver.findElement(By.xpath("(//div[@class='_12kvah7'])[2]")).click();

		// click on KnowledgeSets button
		driver.findElement(By.xpath("(//li[@class='MuiBreadcrumbs-li'])[2]")).click();

		// Assertion
		WebElement title = driver.findElement(By.xpath("//h1[@class='_1tfolp8']"));
		Assert.assertEquals(title.isDisplayed(), true);
	}
}
