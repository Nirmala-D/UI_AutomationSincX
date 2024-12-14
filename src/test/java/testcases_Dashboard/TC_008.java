package testcases_Dashboard;

import java.time.Duration;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_008 extends BaseClass {
  @Test
  public void tc_008() {
	  
	  		Login();
	  		
	  		
	  		 // Find element for sort/filter
            driver.findElement(By.xpath("//div[@class='_c77kua']")).click();

            // Find element for published year filter
            driver.findElement(By.xpath("//input[@placeholder='Published year']")).click();

            // Find elements for published year options
            List<WebElement> yearOptions = driver.findElements(By.xpath("//li[contains(@id,'mui-autocomplete')]"));

            // Loop through the list to find and click the year 2023
            for (WebElement option : yearOptions) {
                String yearText = option.getText();
                if (yearText.equalsIgnoreCase("2023")) {
                    option.click();
                    break;
                }
            }

            // Find element for apply button
            driver.findElement(By.xpath("//p[@class='_1yanunz']")).click();

            // Find element for Published year 2023 for assertion
            WebElement publishedYear2023 = driver.findElement(By.xpath("//div[@class='_13hqe44']"));
            Assert.assertTrue(publishedYear2023.isDisplayed());
}
	  		
}