package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnGrp {
	WebDriver driver;
	
	@Test(groups="login")
	public void verifyLoginTitle() {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("C:\\SELENIUM OJT\\SELENIUM OJT\\OFFLINE WEBSITE\\javabykiran-Selenium-Softwares (2)\\javabykiran-Selenium-Softwares\\Offline Website\\index.html");
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
	}
		
		@Test(groups="login",dependsOnMethods ="verifyLoginTitle")
		public void login() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(),"JavaByKiran |DashBoard");
		
	}
	@Test(dependsOnGroups ="login")//execute only when login is successful
	public void dashBoard() {
		WebElement we=driver.findElement(By.tagName("abc"));//tagname will not fount so dashboard get failed
		Assert.assertTrue(we.isDisplayed());
	}
	}


