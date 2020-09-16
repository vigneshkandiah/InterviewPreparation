package SeleniumInterviewQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryclass1 implements IRetryAnalyzer{
	int limit=3;

	int failcount=0;
	public boolean retry(ITestResult result) {
		
		

		if(failcount<limit) {
           failcount++;

			return true;
		}
		
		return false;
	}



}
