package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_020_Courses extends BaseClass {
  @Test
  public void tc_020_Verify_KnowledgeSets() {
	  
		Login();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[38]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on edit button from popup window
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();

		// click on edit in settings 
		driver.findElement(By.xpath("((//button[@type='button'])[2]")).click();

		// click on knowledge sets dropdown
		driver.findElement(By.cssSelector("#mui-autocomplete-92854")).click();

		// select manual testing skills from dropdown
		driver.findElement(By.xpath("(//li[@id='mui-autocomplete-92854-option-5'])[1]")).click();

		// click on save button
		driver.findElement(By.xpath("//p[@class='_gkprm7'][1]\")")).click();
	}
}
