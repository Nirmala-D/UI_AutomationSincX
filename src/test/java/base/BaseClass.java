package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	
	public static WebDriver driver;
	String baseURL= "https://d37woh9mydma00.cloudfront.net/login";
	String browser = "Chrome";
	/*String domain="busyqa.com";
	String email="nirmaladeekonda2015@gmail.com";
	String password="QAtest!@#123";
	*/
 @BeforeClass	
 public void setup()
 {
	if(browser.equalsIgnoreCase("chrome"))
	{
	//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	
	driver.get(baseURL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));}
 
 
 public void Login() {
    
		// enter domain name
		driver.findElement(By.id("domainName")).sendKeys("busyqa.com");

		// click on the continue button
		driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();

		// enter valid email "nirmaladeekonda2015@gmail.com"
		driver.findElement(By.id("userName")).sendKeys("nirmaladeekonda2015@gmail.com");

		// click on the continue button
		driver.findElement(By.xpath("//p[@class='_1fnrmou']")).click();

		// enter valid password as QAtest!@#123 in password field
		driver.findElement(By.id("pword")).sendKeys("QAtest!@#123");

		// click on the Login button
		driver.findElement(By.xpath("// p[@class=\"_1fnrmou\"]")).click();

		// find element for SincX logo
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")).click();
	 }
 
 
 
 
 @AfterClass
 public void teardown()
 {
 driver.quit();
 }

}
