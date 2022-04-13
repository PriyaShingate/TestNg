package TestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAttributes {
	
	@Test
	public void login() {
		Assert.assertTrue(true);
		
	}
	@Test(dependsOnMethods ="login")
	public void dashBoard() {
		
	}
	@Test(dependsOnMethods ="dashBoard")
	public void user() {
		
	}
}
//======================================================================
//AlwaysRun Attribute-it is used if methods are partially depends on each other.
//eg.user is partially depends on dashboard page so, alwaysRun used if dashboard get failed
//@Test
//public void login() {
//	
//}
//@Test(dependsOnMethods ="login")
//public void dashBoard() {
//	Assert.assertTrue(false);
//}
//	
//@Test(dependsOnMethods ="dashBoard",alwaysRun=true)
//public void user() {
//	
//}
//}

//=====================================================================
//Actual offline website Attribute uses=
//WebDriver driver;
//@Test
//public void login() {
//	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("C:\\SELENIUM OJT\\SELENIUM OJT\\OFFLINE WEBSITE\\javabykiran-Selenium-Softwares (2)\\javabykiran-Selenium-Softwares\\Offline Website\\index.html");
//	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("123456");
//	driver.findElement(By.xpath("//button")).click();
//	Assert.assertEquals(driver.getTitle(),"javaByKiran |DashBoard");
//	
//	
//}
//@Test(dependsOnMethods ="login")
//public void dashBoard() {
//	WebElement we=driver.findElement(By.tagName("abc"));//tagname will not fount so dashboard get failed
//	Assert.assertTrue(we.isDisplayed());
//}
//@Test(dependsOnMethods ="dashBoard",alwaysRun=true)
//public void user() {                               //user is partially depend on dashboard so use alwaysRun if dashboard get failed.
//	driver.findElement(By.xpath("//span[text()='users']")).click();
//	
//}
//}
//==================================================================================
//enabled=false it is used when (test case is not ready for execution )user page is  not ready for execution(under development)
//developer making offline website login page and dashboard page is developed but user page is still in process(under development)
//WebDriver driver;
//@Test
//public void login() {
//	System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("C:\\SELENIUM OJT\\SELENIUM OJT\\OFFLINE WEBSITE\\javabykiran-Selenium-Softwares (2)\\javabykiran-Selenium-Softwares\\Offline Website\\index.html");
//	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
//	driver.findElement(By.id("password")).sendKeys("123456");
//	driver.findElement(By.xpath("//button")).click();
//	Assert.assertEquals(driver.getTitle(),"javaByKiran |DashBoard");
//	
//	
//}
//@Test(dependsOnMethods ="login")
//public void dashBoard() {
//	WebElement we=driver.findElement(By.tagName("h1"));//tagname will  found so dashboard get passed
//	Assert.assertTrue(we.isDisplayed());
//}
//@Test(dependsOnMethods ="dashBoard",enabled=false)
//public void user() {                               //user is partially depend on dashboard so use alwaysRun if dashboard get failed.
//	driver.findElement(By.xpath("//span[text()='users']")).click();
//	
//}
//}

