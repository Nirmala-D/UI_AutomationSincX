package testcases_Courses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
public class TC_024_Courses extends BaseClass{
  @Test
  public void tc_024_Course_Assessment_Section() throws Exception {
	   Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on edit button from popup window
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();
	  
	  // click on the Edit button in Assessment
	  driver.findElement(By.xpath("//div[4]//div[1]//div[1]//div[1]//button[1]//span[1]//p[1]")).click();
	  
	  //click on the Assessment dropdown 
	  driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiTextField-root _rtlgk2 MuiFormControl-fullWidth']")).click();
	  Thread.sleep(2000);
	  
	  // select yes from the dropdown menu
	 List<WebElement> list = driver.findElements(By.xpath("(//li[@class='MuiAutocomplete-option'])[1]"));
	// Loop through the list to find and click the Disabled option
	 for (WebElement element : list) {
         String actual = element.getText(); 
         if (actual.equalsIgnoreCase("YES")) {
             element.click();
             break;  }
     }
	 // click on Assessment Pass percentage dropdown menu
	
	    driver.findElement(By.id("assessmentPassPercent")).sendKeys("75");
	  
	  // click on save button
	  driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text _cgnn4d\"]")).click();
	  Thread.sleep(3000);
	  
	  // find element for Assessment section
	  WebElement AssessmentUpdated = driver.findElement(By.xpath("(//div[@class=\"_w54tgl\"])[4]"));
	  Assert.assertEquals(AssessmentUpdated.isDisplayed(), true);
	  
	  
	  
  }
}
