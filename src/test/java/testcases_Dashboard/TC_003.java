package testcases_Dashboard;

import java.io.File;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_003 extends BaseClass{
	
	
  @Test
  public void tc_003() {
	  
	  Login();
	  
	  //click on download button for Assigned courses
	  driver.findElement(By.xpath("//p[@class=\"_gkprm7\"]")).click();
	  
	  // Assertion for downloaded file
	  File downloadedFile = new File("C:\\Users\\bujji\\Downloads");
      Assert.assertTrue(downloadedFile.exists());
  
  }
}
