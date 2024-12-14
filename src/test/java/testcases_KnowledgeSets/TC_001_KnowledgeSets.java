package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_001_KnowledgeSets extends BaseClass{
  @Test
  public void tc_001_KnowledgeSets_title() {
	  
 Login();
	   
	  
	  // click on knowledgesets
	  driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[3]")).click();
	  
	  // Assertion - knowledge Sets title
	  WebElement table = driver.findElement(By.xpath("//h1[@class='_1tfolp8']"));
	  Assert.assertEquals(table.isDisplayed(), true);
	  
  }
}
