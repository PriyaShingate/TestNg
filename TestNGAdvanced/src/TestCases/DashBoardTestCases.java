package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

public class DashBoardTestCases {
	
	static WebDriver driver;
	@BeforeMethod
	public static void dashBoardcheck(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		System.out.println("URL open successfully.");
	}
	@AfterMethod
	public void afterClass() {
		driver.close();
		System.out.println("URL closed");
	}
	
	@Test(priority=6)
	public void verifySecondLinkOpen() {
		driver.findElement(By.xpath("//h3//following::a")).click();
		String exp="JavaByKiran | Dashboard";
		Assert.assertEquals(driver.getTitle(),exp);
	}	
	@Test(priority=7)
	public void verifyThirdLinkOpen() {
		driver.findElement(By.xpath("//h3//following::a")).click();
		String exp="python-syllabus.pdf";
		Assert.assertEquals(driver.getTitle(),exp);
	}	
	@Test(priority=8)
	public void verifyFourthLinkOpen() {
		driver.findElement(By.xpath("//h3//following::a")).click();
		String exp="JavaByKiran | Dashboard";
		Assert.assertEquals(driver.getTitle(),exp);
	}	
	
	@Test(priority=9)
	public void multiLinkOpenDashSizeCheck() {
	List<WebElement> ll=driver.findElements(By.partialLinkText("More")); //for open multiple links of dashboard at a time like selenium,java,python ,php,etc.
	System.out.println(ll.size());
	System.out.println("All four links open successfully");
	 Assert.assertEquals(ll.size(),4);
	}
	@Test
	public void coursesTitles() {
		ArrayList<String>actCourseTitle=new ArrayList<String>();
		List<WebElement>coursetit=driver.findElements(By.xpath("//h3"));
		for (WebElement ListOfCoursestit : coursetit) {
		String actCoursetitList=ListOfCoursestit.getText();
			actCourseTitle.add(actCoursetitList);
		}
		ArrayList<String>expCourseTitle=new ArrayList<String>();
		 expCourseTitle.add("Selenium");
		 expCourseTitle.add("Java / J2EE");
		 expCourseTitle.add("Python");
		 expCourseTitle.add("Php");
	  Assert.assertEquals(actCourseTitle,expCourseTitle);
	}
	@Test
	public void courses() {
		ArrayList<String>actCourse=new ArrayList<String>();
		List<WebElement>course=driver.findElements(By.xpath("//h3//following::p"));
		//System.out.println(course.size());
		for (WebElement ListOfCourses : course) {
		String actCoursetitList=ListOfCourses.getText();
			actCourse.add(actCoursetitList);
			System.out.println(ListOfCourses.getText());
		}
		ArrayList<String>expCourse=new ArrayList<String>();
		 expCourse.add("Automation Testing");
		 expCourse.add("Software Development");
		 expCourse.add("Data Science");
		 expCourse.add("Web Development");
	  Assert.assertEquals(actCourse,expCourse);
	}
	@Test
	public void MoreInfo() {
		ArrayList<String>act=new ArrayList<String>();
		List<WebElement>moreInfTag=driver.findElements(By.xpath("//h3//following::a"));
		for (WebElement mInfo : moreInfTag) {
		String moreInf=mInfo.getText();
			act.add(moreInf);
			System.out.println(mInfo.getText());
		}
		ArrayList<String>exp=new ArrayList<String>();
		 exp.add("More info");
		 exp.add("More info");
		 exp.add("More info");
		 exp.add("More info");
		 exp.add("JavaByKiran");
	  Assert.assertEquals(act,exp);
	}
	@Test(priority=1)
	 public void usersCheck() {
		 driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		 String exp="JavaByKiran | User";
		 Assert.assertEquals(driver.getTitle(),exp);
	 }
	 @Test(dependsOnMethods = "usersCheck")
	   public void userListTableSizeCheck() {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		List<WebElement> web=driver.findElements(By.tagName("tr"));
		System.out.println(web.size());
		
		Assert.assertEquals(web.size(),5);
		 }
	 @Test(priority=3)
	 public void operatorsCheck() {
		 driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a/span")).click();
		 String exp="JavaByKiran | Operators";
		 Assert.assertEquals(driver.getTitle(),exp);
	 }
	 @Test(priority=4)
	 public void usefulLinksCheck() {
		 driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).click();
		 String exp="JavaByKiran | Useful Links";
		 Assert.assertEquals(driver.getTitle(),exp);
	 }
	 @Test(priority=5)
	 public void downloads() {
		 driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a")).click();
		 String exp="JavaByKiran | Downloads";
		 Assert.assertEquals(driver.getTitle(),exp);
	 }
	 
	 @Test
	 public void checkMainNavigationList() {
		 ArrayList<String>actList=new ArrayList<String>();
		 List<WebElement>listOfElements=driver.findElements(By.xpath("//li"));
		 for (WebElement navigationList : listOfElements) {
		String List	=navigationList.getText();
		actList.add(List);
		System.out.println(navigationList.getText());
		}
		 System.out.println(actList);
		 ArrayList<String>expList=new ArrayList<String>();
		 expList.add("Dashboard");
		 expList.add("Users");
		 expList.add("Operators");
		 expList.add("Useful Links");
		 expList.add("DownLoads");
		 expList.add("Logout");
		 Assert.assertEquals(actList,expList);
	 }
  
	@Test(priority=10)
	public void logOut() {
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();//click logout button
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
	}
   


}
