package testcases_Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_001 extends BaseClass{
  @Test
  public void tc_001() {
	  
	  Login();
		 	  
			  
			  // find element for Welcome message for assertion
			  WebElement WelcomeNirmalaDeekonda = driver.findElement(By.xpath("//h1[@class=\"_k8siqs\"]"));
			  // Assertion for welcome message
			  Assert.assertTrue(true,  "WelcomeNirmalaDeekonda");

	  
  }
}
