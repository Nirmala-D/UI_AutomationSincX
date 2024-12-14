package testcases_Courses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_021_Courses extends BaseClass{
  @Test
  public void tc_021_Course_DiscoveryMode() throws InterruptedException {
	  
	  Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on edit button from popup window
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();
		
		// Click on edit from the settings section
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		Thread.sleep(3000); 
		
		// click on dropdown arrow
		List<WebElement> list = driver.findElements(By.xpath("(//button[@title=\"Open\"])[1]"));
		
		// Loop through the list to find and click the open option
				for (WebElement element : list) {
					String actual = element.getText();
					if (actual.equalsIgnoreCase("OPEN")) {
						element.click();
						break;    }             	}
		
		// click on save button
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text _cgnn4d'])[1]")).click();
		
		// find element for Discovery mode
		WebElement DiscoveryMode_Open = driver.findElement(By.xpath("(//p[normalize-space()='Discovery Mode'])[1]"));
		Assert.assertEquals(DiscoveryMode_Open.isDisplayed(), true);

  }
}
