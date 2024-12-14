package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_057_Courses extends BaseClass {
  @Test
  public void tc_057_Verify_Settings_symbol() {
	  
		Login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();

		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[38]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on edit
		driver.findElement(By.cssSelector("._d17jlg")).click();

		// click on users tab
		driver.findElement(By.xpath("(//p[@class='_1qr5fe8'])[6]")).click();

		// click on settings symbol
		driver.findElement(By.xpath("//div[@class='_103ycj2']")).click();

		// Assertion
		WebElement popup_window = driver.findElement(By.xpath("//div[@class='_e2rpdg']"));
		Assert.assertEquals(popup_window.isDisplayed(), true);
  }
}
