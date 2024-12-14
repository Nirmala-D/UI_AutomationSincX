package testcases_Courses;

import java.time.Duration;import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_033_Courses extends BaseClass{
	
	
  private WebDriverWait wait;

@Test
  public void tc_033_Verify_Add_Learners() throws Exception {
	  
	  Login();
	  
	  
	  Thread.sleep(3000);;

	  // Find element for Courses option
      driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

      // Click on 3 dots next to the course
      driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();

      // Click on edit button from popup window
      driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();

      // Click on the Users tab next to the preview tab
      driver.findElement(By.xpath("//p[@class='_1qr5fe8'][normalize-space()='Users']")).click();

      // Click on Add button in learners section
      driver.findElement(By.xpath("(//p[@class='_1493vjz2'])[4]")).click();

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

      // Step 5: Click on the down arrow from the Learners dialog box
      WebElement learnerDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='MuiInputBase-input MuiInput-input _6uh8gf MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd']")));
      learnerDropdown.click();

      // Step 6: Select learner name from the dropdown
      WebElement learnerOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(), 'Ankita Bharadhwaj (ankitabharadhwaj24@gmail.com)')]"))); 
      learnerOption.click();
      
   // Explicitly wait for the save button to be clickable
      WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text _cgnn4d']")));
      System.out.println("Save button is clickable");

      // Click on save button
      saveButton.click();
      System.out.println("Clicked on save button");

      // Find element for Added Learner
      WebElement learnerAdded = driver.findElement(By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body _19hrflg'])[13]"));
      Assert.assertSame(learnerAdded, learnerAdded);

  		}
}
     


	
  
