package testcases_SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_004_SignIn extends BaseClass {
  @Test
  public void tc_004_validEmail() {

		// enter domain name
		driver.findElement(By.id("domainName")).sendKeys("busyqa.com");

		// click on the continue button
		driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();

		// enter valid email "nirmaladeekonda2015@gmail.com"
		driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");

		// click on the continue button
		driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();

		// find element for word (password) present on the login page
		WebElement password = driver.findElement(By.xpath("//p[@for=\"password\"]"));
		Assert.assertEquals(password.isDisplayed(), true);

  }
}
