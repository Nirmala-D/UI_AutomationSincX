package testcases_Courses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_016_Courses extends BaseClass {
  @Test
  public void tc_016_Verify_Mainsection_Edit_Button() throws InterruptedException {
	  
	  Login();

		// find element for Courses option
		driver.findElement(By.xpath("(//img[@alt='Menu icon alt'])[2]")).click();
		
		// click on 3 dots next to the GUI testing course
		driver.findElement(By.xpath("(//button[@type='button'])[40]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// click on edit button from popup window
		driver.findElement(By.xpath("(//p[@class='_d17jlg'])[1]")).click();
		
		// cllick on Edit button from details section
		driver.findElement(By.xpath("(//p[contains(text(),'Edit')])[1]")).click();
		
		//type GUI in text box
		driver.findElement(By.id("title")).sendKeys("GUI");
		
		// type 10 in duration
		driver.findElement(By.id("duration")).sendKeys("10");
		
		// click on browse 
		driver.findElement(By.xpath("//span[@class='_11rh7af']")).click(); 
		
		
		// Upload file
		Thread.sleep(3000);
        WebElement fileInput = driver.findElement(By.name("C:\\\\Users\\\\bujji\\\\Downloads"));
        fileInput.sendKeys("\\bug-reports.jpg");
		}
}
		