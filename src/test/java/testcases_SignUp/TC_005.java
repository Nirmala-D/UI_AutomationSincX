package testcases_SignUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_005 extends BaseClass{
	
	
  @Test
  public void tc_005() {
	  
	//open a sincx website 
	  driver.get("https://www.sincxapp.com");
	  
	// minimize the window
	 driver.manage().window().minimize();
	  
	// Simulate minimizing the window by setting it to a very small size
      Dimension minimizedSize = new Dimension(516, 200);
      driver.manage().window().setSize(minimizedSize);
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      // Get the current window size
      Dimension actualSize = driver.manage().window().getSize();

      // Assert that the window size is as expected
      Assert.assertEquals(actualSize.getWidth(), minimizedSize.getWidth(), "Width is not as expected");
      Assert.assertEquals(actualSize.getHeight(), minimizedSize.getHeight(), "Height is not as expected"); 
	  
  }
}
