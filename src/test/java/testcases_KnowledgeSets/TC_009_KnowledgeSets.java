package testcases_KnowledgeSets;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_009_KnowledgeSets extends BaseClass{
  @Test
  public void tc_009_Verify_Deletebutton() throws Exception {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on 3 dots of Adriele test1
		driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[1]")).click();

	  
	  // click on delete button
	  driver.findElement(By.xpath("//p[@class='_2kamhyo']")).click();
	  
	  // type delete in the dialog box
	  driver.findElement(By.id("delete")).sendKeys("delete");
	  
	  // click on delete button
	  driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
	  
	 // Assertion: Check if the element is not present
      Assert.assertFalse(isElementPresent(By.xpath("//span[text()='Adriele test1']")));

	  }

private boolean isElementPresent(By xpath) {
	// TODO Auto-generated method stub
	return false;
}
}
