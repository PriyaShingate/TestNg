package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsefulLink {
	
	static WebDriver driver;
	@BeforeClass
	public static void usefulLinkscheck(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/pages/examples/links.html");
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void usefullinks(){
	System.out.println("DashBoard Page Open Sucessfully");
	}
	@Test
	public void verifyLableOfUsefulLink() {
		driver.get("file:///D:/Offline%20Website/pages/examples/links.html");
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3")).getText();
		String exp="* Internet Required";
		Assert.assertEquals(act,exp);
	}	
	@Test
	public void verifyHeadingOfUsefulLink() {
		driver.get("file:///D:/Offline%20Website/pages/examples/links.html");
		String act=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String exp="Useful Links";
		Assert.assertEquals(act,exp);
	}	
}
