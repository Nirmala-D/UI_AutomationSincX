package testcases_Dashboard;

import java.time.Duration;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_006 extends BaseClass {
  @Test
  public void tc_006() {
	  
	  Login();

		// find element for sort/filer
		driver.findElement(By.xpath("//div[@class=\"_c77kua\"]")).click();

		// find element for Course Status
		driver.findElement(By.xpath("//input[@placeholder=\"Course status\"]")).click();
		
		//find element for disable option
		List<WebElement> list1 = driver.findElements(By.xpath("//li[@class='MuiAutocomplete-option']"));

		for (int i = 0; i < list1.size(); i++) {
			String actual = list1.get(i).getText();

			if (actual.equalsIgnoreCase("disabled")) {
				list1.get(i).click();
				break;
			}
		}

		// find element for apply button
		driver.findElement(By.xpath("//p[@class='_1yanunz'][1]")).click();

		// find element for course status Disable pop-up button
		WebElement CoursestatusDisable = driver.findElement(By.xpath("//div[@class=\"_13hqe44\"]"));
		Assert.assertEquals("CoursestatusDisable", true);
	}
}
