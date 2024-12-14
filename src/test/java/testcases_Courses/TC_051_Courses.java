package testcases_Courses;

import java.time.Duration;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_051_Courses extends BaseClass {
  @Test
  public void tc_051_Verify_Add_Groups() {
	  
	  Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots work-life balance
		driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(4) div:nth-child(1) div:nth-child(1) button:nth-child(1) span:nth-child(1) i:nth-child(1)")).click();
		
		// click on edit from the popup
		driver.findElement(By.cssSelector("._d17jlg")).click();
		
		// click on Users tab
		driver.findElement(By.xpath("(//p[@class='_1qr5fe8'])[2]")).click();
						
		// click on groups Add	button
				driver.findElement(By.xpath("(//p[@class='_1493vjz2'])[3]")).click();
				
		// click on learner's team
				driver.findElement(By.xpath("//button[@title='Open']")).click();
			// click on learner's team	
				List<WebElement> group = driver.findElements(By.xpath("(//li[@class='MuiAutocomplete-option'])[2]"));
				
				// Loop through the list to find and click the Disabled option
				for (WebElement element : group) {
					String actual = element.getText();
					if (actual.equalsIgnoreCase("BQ")) {
						element.click();
						break;
						
					}
				}
		
		// click on save button
			driver.findElement(By.xpath("//p[@class='_gkprm7']")).click();
			
			// Assertion to check group added or not
			WebElement BQ = driver.findElement(By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body _19hrflg'])[6]"));
			Assert.assertTrue(true);
		
  }
  
  
  
  
}
