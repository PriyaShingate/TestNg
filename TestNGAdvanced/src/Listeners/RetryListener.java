package Listeners;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryListener implements IRetryAnalyzer {

	
	int count=1;
	int maxlimit=3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<maxlimit) {
			count++;  // 2 3
			return true;
		}
		return false;
	}
	

}
