package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoRetryListener {
	@Test(invocationCount=5)
	  public void Test01() {
		System.out.println("Test01");
	  }
	  @Test
	  public void Test02() {
			System.out.println("Test02");
			Assert.assertTrue(false);
	  }
	  @Test
	  public void Test03() {
			System.out.println("Test03");
	  }


}
