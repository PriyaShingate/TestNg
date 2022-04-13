package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTestCases {
	
	static WebDriver driver=null;
	
	@BeforeMethod
	public static void logincheck(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void logout() {
		driver.close();
		System.out.println("Close current window");
	}
//	@BeforeTest
//	public void loginstatus(){
//	System.out.println("Login Page Open Sucessfully");
//	}
	@Test(priority=1)
	public void checkTitleLoginPage() {
 		String expectedHeading="JavaByKiran | Log in";
		Assert.assertEquals(driver.getTitle(),expectedHeading);
	}
	@Test(priority=2)
	public void checklogo() {
		boolean img=driver.findElement(By.xpath("//img")).isDisplayed();
		Assert.assertEquals(img,true);
	}
	@Test(priority=3)
	public void checkHeading() {
		String actualHeading=driver.findElement(By.xpath("//b")).getText();
		String expectedHeading="Java By Kiran";
		Assert.assertEquals(actualHeading,expectedHeading);
   }
	@Test(priority=4)
	public void checkLabel() {
	    String actlabel=driver.findElement(By.xpath("//*[text()='Sign in to start your session']")).getText();
	    System.out.println(actlabel);
        String explabel="Sign in to start your session";
	    Assert.assertEquals(actlabel,explabel);
	}
	@Test(priority=7)
	public void registrationPage () throws Exception {
	    driver.findElement(By.xpath("//*[@class='text-center']")).click();
	    Thread.sleep(5000);
	    Assert.assertEquals(driver.getTitle(),"JavaByKiran | Registration Page");
	}
	@Test(priority=5)
	public void verifyErrorMessageUsernameBlank() {
	driver.findElement(By.id("email")).sendKeys("");
	driver.findElement(By.xpath("//button")).click();
	String actErrormessage=driver.findElement(By.id("email_error")).getText();
	String expErrormessage="Please enter email.";
	Assert.assertEquals(actErrormessage,expErrormessage);
	}	
	@Test(priority=6)
	public void verifyErrorMessagePasswardBlank() {
	driver.findElement(By.id("password")).sendKeys("");
	driver.findElement(By.xpath("//button")).click();
	String actErrormessage=driver.findElement(By.id("password_error")).getText();
	String expErrormessage="Please enter password.";
	Assert.assertEquals(actErrormessage,expErrormessage);
	}	
	
	@Test(priority=8)
	public void login() {
	//driver.get("file:///D:/Offline%20Website/index.html");
	//driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button")).click();
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@AfterTest
	public void AfterTest() {
	System.out.println("Login page closed successfully");
		
	}
}
