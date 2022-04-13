package WindowFrameHandle;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowHandle {
	
	static WebDriver driver;
	@Test
	public static void Test01() throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		//there is only one window in browser
		List<WebElement> links=driver.findElements(By.partialLinkText("info"));
		
		String mainWindow=driver.getWindowHandle();//string is return type of getwindowhandle.string gives unique id for each window
		
		for (WebElement link : links) {
			link.click();
			
			Thread.sleep(5000);
		}
		//there are five windows in browser.
		  Set<String> allWindows=driver.getWindowHandles();// 5 values
		  System.out.println("Total number of tabs open  :"+allWindows.size());
		  
		  for (String wins : allWindows) {
			  System.out.println("Id of a window is  :"+ wins);
			  if(!wins.equals(mainWindow)) {
				  driver.switchTo().window(wins);
				  System.out.println(driver.getCurrentUrl());
				  System.out.println(driver.getTitle());
				driver.close();
				}
			  else {
				  System.out.println("User is already on parent window");
			  }
			
		} 
			
		}
	

}
