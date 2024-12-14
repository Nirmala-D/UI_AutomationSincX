package testcases_KnowledgeSets;

import org.openqa.selenium.By;import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_003_KnowledgeSets extends BaseClass {
  @Test
  public void tc_003_Verify_3dots() {
	  
 Login();
	   
	  
	  // click on knowledgesets
	  driver.findElement(By.xpath("//p[@class='_1hx0zhz'][text()='Knowledge Sets']")).click();
	  
  // click on 3dots of adriele test
	  driver.findElement(By.xpath("(//td//i[@class='material-icons-outlined'])[2]")).click();
	  
	  // Assertion - popup window
	  WebElement PopupWindow = driver.findElement(By.xpath("//div[@class='MuiPaper-root MuiPopover-paper _1s0g7xi MuiPaper-elevation8 MuiPaper-rounded']"));
	  Assert.assertEquals(PopupWindow.isDisplayed(), true); 
  }
}
