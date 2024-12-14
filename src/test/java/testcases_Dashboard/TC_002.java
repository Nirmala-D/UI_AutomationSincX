package testcases_Dashboard;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_002 extends BaseClass{
	
@Test
  public void tc_002_downloadbutton() {
	
	Login();
	  
	  // click on Download button for Assigned learners
	  driver.findElement(By.xpath("(//p[@class='_gkprm7'][normalize-space()='Download'])[1]")).click();
	  
	  // Assertion for downloaded file
	  File downloadedFile = new File("C:\\Users\\bujji\\Downloads");
      Assert.assertTrue(downloadedFile.exists());
  }
  }

