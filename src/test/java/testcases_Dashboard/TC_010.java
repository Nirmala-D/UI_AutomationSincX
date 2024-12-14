package testcases_Dashboard;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_010 extends BaseClass {
	
  @Test
  public void TC_010_libraryOptions() {
	  
	       Login();
	       
	       // Find element for sort/filter
	       driver.findElement(By.xpath("//div[@class='_c77kua']")).click();

     
     // Click on Library filter
     driver.findElement(By.xpath("//input[@placeholder='From library']")).click();
     
     // click on library options Yes from dropdown
     WebElement LibraryOptions = driver.findElement(By.xpath("(//input[@id='mui-autocomplete-35103'])[1] "));
     
  WebElement[] libraryOptions = null;
	// Loop through the list to find and click the YES
     for (WebElement option : libraryOptions) {
         String libraryText = option.getText();
         if (libraryText.equalsIgnoreCase("YES")) {
             option.click();
             break;
         }
     }

     // Find element for apply button
     driver.findElement(By.xpath("//p[@class='_1yanunz']")).click();

     // Find element for From Library YES for assertion
     WebElement fromLibraryYES = driver.findElement(By.xpath("//div[@class='_mecsd2']"));
     Assert.assertTrue(fromLibraryYES.isDisplayed());
     
  }
  }

	  
	  