package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_002_KnowledgeSets extends BaseClass{
  @Test
  public void tc_002_KnowledgeSets_Info() {
	  
Login();
	   
	  
	  // click on knowledgesets
	  driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[3]")).click();
	  
	  // Assertion
	  WebElement table = driver.findElement(By.xpath("//table[@class='MuiTable-root _nzyk8q']"));
	  Assert.assertEquals(table.isDisplayed(), true);
	  
  }
}
