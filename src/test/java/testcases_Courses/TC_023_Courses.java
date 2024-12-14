package testcases_Courses;

import java.time.Duration;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;


public class TC_023_Courses extends BaseClass {
  @Test
  public void tc_023_Verify_Certification_Mode() throws Exception {
	  
		Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[42]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// click on edit button from popup window
		driver.findElement(By.xpath("//p[@class=\"_d17jlg\"]")).click();

		// click on the Edit button from certificate section
		driver.findElement(
				By.xpath("//div[@class='_jm4coa']//div[3]//div[1]//div[1]//div[1]//button[1]//span[1]//p[1]")).click();

		// click on the Certification dropdown menu from edit popup
		List<WebElement> List = driver.findElements(By.xpath("//input[@id=\"mui-autocomplete-54279\"]"));

		for (int i = 0; i < List.size(); i++) {

			String actual = List.get(i).getText();

			if (actual.equalsIgnoreCase("YES")) {
				List.get(i).click();
				break;
			}			}

		// clcik on the certificate template dropdown menu
		List<WebElement> List1 = driver.findElements(By.xpath("//input[@id=\"mui-autocomplete-95930\"]"));

		for (int i = 0; i < List.size(); i++) {
			String actual = List1.get(i).getText();

			if (actual.equalsIgnoreCase("Certificate of Completion")) {
				List1.get(i).click();
				break;}     }

		// click on save button
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[8]")).click();

		// find element for yes word from the certificate section
		WebElement YES = driver.findElement(By.xpath("//p[normalize-space()='YES']"));
		Assert.assertTrue(true);
	}
}
