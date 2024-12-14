package testcases_Courses;

import java.time.Duration;import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import base.BaseClass;

public class TC_027_Courses extends BaseClass {
	
	
  @Test
  public void tc_027_Verify_ADD_Assessments() throws Exception{
	  
	  
	 
	  Login();
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("//div[@class='_1evjhr3']//div[2]//div[1]//div[2]")).click();

	        // Click on the 3 dots next to the GUI testing course
	        driver.findElement(By.xpath("(//button[@type='button'])[40]")).click();

	        // Click on the edit button from the popup window
	        driver.findElement(By.xpath("//p[@class='_d17jlg']")).click();

	        // Click on the Assessment tab
	        driver.findElement(By.xpath("(//a[@class='_q9xnxf'])[3]")).click();

	        // Click on the Add button from the Assessment tab
	        driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();

	        // Find the element for the title text box and enter text
	        driver.findElement(By.xpath("(//textarea[@id='title'])[1]")).sendKeys("What is GUI Testing");

	        // Find the element for the order text box and enter text
	        driver.findElement(By.id("order")).sendKeys("001");

	        // Find and click on the question type dropdown menu
	        driver.findElement(By.xpath("//button[@title='Open']")).click();

	        // Wait for the dropdown options to be visible
	        Thread.sleep(3000);
	        List<WebElement> list = driver.findElements(By.xpath("(//li[@class='MuiAutocomplete-option'])[2]"));

	        for (WebElement element : list) {
	            String actual = element.getText();
	            if (actual.equalsIgnoreCase("Options - Single Answer")) {
	                element.click();
	                break;
	            }
	        }

	        // click on save button
	      driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text _cgnn4d']")).click();
	        System.out.println("Save button is clickable");

	        // Find element for order info and verify it's displayed
	        WebElement orderInfoAdded = driver.findElement(By.xpath("//table[@class='MuiTable-root _nzyk8q']"));
	        Assert.assertTrue(orderInfoAdded.isDisplayed(), "Order info should be displayed");
  }


}