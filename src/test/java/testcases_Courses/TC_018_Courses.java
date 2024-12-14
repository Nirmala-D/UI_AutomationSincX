package testcases_Courses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_018_Courses extends BaseClass{


@Test
  public void tc_018_Verify_CourseStatus_Disable() throws Exception {
	  
		Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Find element for Courses option and click
        driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

        // Click on 3 dots next to the GUI testing course
        driver.findElement(By.xpath("(//button[@type='button'])[40]")).click();

        // Wait for the popup window to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Click on edit button from popup window
        driver.findElement(By.xpath("//p[@class='_d17jlg']")).click();

        // Click on edit from the settings section
        driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();

        // Click on status
       driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/form/div[1]/div[1]/form/div/div[2]/div/div/div/button[2]")).click();
    
        // Click on Disabled
        List<WebElement> list = driver.findElements(By.xpath("(//li[@class='MuiAutocomplete-option'])[3]"));
        
        // Loop through the list to find and click the Disabled option
        for (WebElement element : list) {
            String actual = element.getText(); 
            if (actual.equalsIgnoreCase("DISABLED")) {
                element.click();
                break;
            }
        }

        // Click on save button
        driver.findElement(By.xpath("//p[@class='_gkprm7']")).click();

        // Assertion
        WebElement disabled = driver.findElement(By.xpath("//p[normalize-space()='DISABLED']"));
        Assert.assertTrue(disabled.isDisplayed());

}
    
}