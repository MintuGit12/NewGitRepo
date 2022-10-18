package com.crm.Generic_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	int count=0;
	int retryAnalyzer=3;

	public boolean retry(ITestResult result) {
		
		if(count<retryAnalyzer)
		{
			count++;
			return true;
		}
		return false;
	}

}
