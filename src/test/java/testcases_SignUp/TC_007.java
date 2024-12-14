package testcases_SignUp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_007 extends BaseClass {
	
	
  @Test 
  public void tc_007 () {
	  
	  //open a sincx website 
	  driver.get("https://www.sincxapp.com");
	  
	  // maximize the window
	  driver.manage().window().maximize();

      // Restore down the window by setting the window to 900x600
      driver.manage().window().setSize(new Dimension(900, 600));
      
      Dimension targetSize = new Dimension(900, 600);
      driver.manage().window().setSize(targetSize);

      // Get the current window size
      Dimension actualSize = driver.manage().window().getSize();

      // Assert the window size
      assertEquals(targetSize.getWidth(), actualSize.getWidth(), "Width is not as expected");
      assertEquals(targetSize.getHeight(), actualSize.getHeight(), "Height is not as expected");
  }

  }

