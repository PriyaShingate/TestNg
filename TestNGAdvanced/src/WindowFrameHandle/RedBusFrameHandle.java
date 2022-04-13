package WindowFrameHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusFrameHandle {
	static WebDriver driver;
	@Test
	public static void Test01() throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		WebElement Frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));//frame can be handle by three ways 1.index 2.id 3.webelement but window can only be handle by using id
		 driver.switchTo().frame(Frame);
		 Thread.sleep(5000);
		
		//driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");
		 driver.findElement(By.xpath("//*[@id=\"newFbId\"]/div[2]")).click();
		 String ss=driver.getWindowHandle();
		 driver.switchTo().window(ss);
		 driver.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=377581119008028&kid_directed_site=0&app_id=377581119008028&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fapp_id%3D377581119008028%26cbt%3D1648725829384%26channel_url%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df1bc0f32fac700c%2526domain%253Dwww.redbus.in%2526is_canvas%253Dfalse%2526origin%253Dhttps%25253A%25252F%25252Fwww.redbus.in%25252Ff110859fbfa5468%2526relation%253Dopener%26client_id%3D377581119008028%26display%3Dpopup%26domain%3Dwww.redbus.in%26e2e%3D%257B%257D%26fallback_redirect_uri%3Dhttps%253A%252F%252Fwww.redbus.in%252Flogin%253FofferType%253DPaymentOffers%2526defaultSlide%253Dhome%2526isOnlyMobile%253Dfalse%26locale%3Den_US%26logger_id%3Df2f54aa7832bc1c%26origin%3D1%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df3cc465686493e4%2526domain%253Dwww.redbus.in%2526is_canvas%253Dfalse%2526origin%253Dhttps%25253A%25252F%25252Fwww.redbus.in%25252Ff110859fbfa5468%2526relation%253Dopener%2526frame%253Df34ef7f4a2e2f38%26response_type%3Dtoken%252Csigned_request%252Cgraph_domain%26scope%3Demail%26sdk%3Djoey%26ret%3Dlogin%26fbapp_pres%3D0%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df3cc465686493e4%26domain%3Dwww.redbus.in%26is_canvas%3Dfalse%26origin%3Dhttps%253A%252F%252Fwww.redbus.in%252Ff110859fbfa5468%26relation%3Dopener%26frame%3Df34ef7f4a2e2f38%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied&display=popup&locale=en_GB&pl_dbl=0");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("123456");
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input")).click();
		 

}
}
