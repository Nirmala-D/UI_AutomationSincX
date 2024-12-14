package testcases_KnowledgeSets;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import org.testng.*;

public class TC_005_KnowledgeSets extends BaseClass{
  @Test
  public void tc_005_Edit_course_Status_live() throws Exception {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		// click on 3 dots of Adriele test
		driver.findElement(By.xpath("(//table[@class='MuiTable-root _nzyk8q']//td//i[@class='material-icons-outlined'])[2]")).click();
		
		// Click on Edit from the popup
		driver.findElement(By.xpath("(//p[@class='_d17jlg'])[1]")).click();

		// Click to open the dropdown
		WebElement dropdownButton = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiAutocomplete-popupIndicator _1hhulki']"));
		dropdownButton.click();
		Thread.sleep(1000); // Add a short wait to ensure the dropdown is opened

		// Find all dropdown options
		List<WebElement> options = driver.findElements(By.xpath("//li[@role='option']"));

		boolean optionFound = false; // Flag to check if the option was found

		// Select "Disabled" from the dropdown
		for (WebElement option : options) {
			String actual = option.getText();
			System.out.println("Found option: " + actual); // Debugging line to print the found options
			if (actual.equalsIgnoreCase("Live")) {
				option.click();
				optionFound = true;
				System.out.println("Live option selected"); // Debugging line to confirm selection
				break;
			}
		}

		if (!optionFound) {
			System.out.println("Live option not found"); // Debugging line if the option was not found
		}

		// click on save button
		driver.findElement(By.xpath("(//p[@class='_gkprm7'])[2]")).click();
		
		//Assertion
		WebElement Disabled = driver.findElement(By.xpath("(//p[@class='_zubb3xw'])[1]"));
		Assert.assertEquals(Disabled.isEnabled(), optionFound);

	}
}
  

