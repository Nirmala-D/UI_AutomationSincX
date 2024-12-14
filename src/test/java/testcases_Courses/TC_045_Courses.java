package testcases_Courses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_045_Courses extends BaseClass{
	
  @Test
  public void tc_045_Verify_add_KnowledgeSets() throws Exception {
	  Login();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots of boosting confidence
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/div[1]/div[1]/button[1]/span[1]/i[1]")).click();
		
		// click on edit button from popup
		driver.findElement(By.cssSelector("._d17jlg")).click();
		
		// click on edit button in settings
		driver.findElement(By.xpath("//div[@class='_8l7bnu']//div[1]//div[1]//div[1]//div[1]//button[1]//span[1]//p[1]")).click();
		
		// click on Knowledge sets dropdown
		driver.findElement(By.xpath("(//div[@class='MuiAutocomplete-root MuiAutocomplete-hasClearIcon MuiAutocomplete-hasPopupIcon'])[3]")).click();
		Thread.sleep(2000);
		
		// select change your life knowledge set
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='MuiAutocomplete-listbox']//li[1]"));
		
		for(WebElement element : list) { 
			String actual = element.getText();
		if (actual.equalsIgnoreCase("Adriele Test")) {
			element.click();
			break;
		}
		}
		
		// click on save button
		driver.findElement(By.xpath("//p[@class='_gkprm7']")).click();
		
		//Assertion
		WebElement Adriele = driver.findElement(By.xpath("(//p[@class='_bcpkw4'])[2]"));
		Assert.assertEquals(Adriele.isDisplayed(), true);
		
		 
		
  }
}
