package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEx {

	WebDriver driver;
	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriverAutoIT.exe");
	    driver=new ChromeDriver();
	    driver.get("https://javabykiran.com/playground/file-upload");
	    
	    driver.findElement(By.id("file")).click();
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("D:\\autoITDemo\\fileUpload.exe");
	}
}
