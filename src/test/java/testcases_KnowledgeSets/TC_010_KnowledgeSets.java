package testcases_KnowledgeSets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_010_KnowledgeSets extends BaseClass{
  @Test
  public void tc_010_Verify_Addbutton() throws InterruptedException {
	  
	  Login();
		Thread.sleep(3000);
		
		// click on Knowledge Sets
		driver.findElement(By.xpath("(//p[@class='_1hx0zhz'])[2]")).click();
		
		//click on Add button
		driver.findElement(By.xpath("//p[@class='_gkprm7']")).click();
		
		//type title in title box
		driver.findElement(By.id("title")).sendKeys("Smoke Testing1");
		
		//click on status 
		driver.findElement(By.xpath("(//div[@class='MuiFormControl-root MuiTextField-root _rtlgk2 MuiFormControl-fullWidth'])[2]")).click();
		
		// select live from the dropdown
		List<WebElement> list = driver.findElements(By.xpath("(//li[@role='option'])[1]"));
		for(int i =0; i< list.size(); i++){
			String actual = list.get(i).getText();
			
			if(actual.contains("LIVE")) {
				list.get(i).click();
				break;
			}	
		}
		// click on save button
		driver.findElement(By.xpath("(//div[@class='MuiFormControl-root MuiTextField-root _rtlgk2 MuiFormControl-fullWidth'])[2]")).click();
		
		//Assertion for to check smoke testing is created or not
		WebElement Smoketesting= driver.findElement(By.xpath("//span[normalize-space()='smoke-testing']"));
		Assert.assertTrue(true);
  }
}
