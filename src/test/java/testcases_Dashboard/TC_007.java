package testcases_Dashboard;

import java.time.Duration;import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_007 extends BaseClass{
  @Test
  public void TC_007() {
	  
		Login();
		
		
		// Find element for sort/filter
        driver.findElement(By.xpath("//div[@class='_c77kua']")).click();

        // Click on published year dropdown
        driver.findElement(By.xpath("//input[@placeholder='Published year']")).click();

        // Find element for published year 2022
        List<WebElement> List1 = driver.findElements(By.xpath("//li[contains(@id,'mui-autocomplete')]"));
        
     // Loop through the list to find and click the year 2022
        for (WebElement element : List1) {
            String actual = element.getText();
            if (actual.equalsIgnoreCase("2022")) {
                element.click();
                break;
            }
        }

        // Find element for apply button
        driver.findElement(By.xpath("//p[@class='_1yanunz']")).click();
            
        // Find element for Published year 2022 for assertion
        WebElement Publishedyear2022 = driver.findElement(By.xpath("//div[@class='_13hqe44']"));
        Assert.assertEquals(Publishedyear2022.isDisplayed(), true);

  }
  
}
		
		