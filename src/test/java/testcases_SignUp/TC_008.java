package testcases_SignUp;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_008 extends BaseClass {
	
	@Test 
  public void tc_008() {
	  
	//open a sincx website 
	  driver.get("https://www.sincxapp.com");
	  
	// Maximize the window
	    driver.manage().window().maximize();

	// Get the current window size
	    Dimension windowSize = driver.manage().window().getSize();

    // Assuming standard screen resolutions, set an arbitrary threshold for "maximized" size
	    int minWidth = 800; // typical minimum width for a maximized window
	    int minHeight = 600; // typical minimum height for a maximized window

	// Assert that the window size is larger than or equal to the threshold
	    Assert.assertTrue(windowSize.getWidth() >= minWidth, "Width is not as expected");
	    Assert.assertTrue(windowSize.getHeight() >= minHeight, "Height is not as expected");

  }
  }
