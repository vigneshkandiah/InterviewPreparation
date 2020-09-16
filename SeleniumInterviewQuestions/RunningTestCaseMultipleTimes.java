
package SeleniumInterviewQuestions;

import org.testng.annotations.Test;

public class RunningTestCaseMultipleTimes {
	@Test(invocationCount = 5)
	public void f() {

		System.out.println("I am Test 1");
	}


}



