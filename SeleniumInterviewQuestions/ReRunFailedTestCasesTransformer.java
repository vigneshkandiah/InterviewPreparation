package SeleniumInterviewQuestions;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class ReRunFailedTestCasesTransformer {
	
	@Test
	public void firstTestCase() {

		System.out.println("This is the first Testcase");

	}
    @Test(retryAnalyzer = Retryclass.class)
	public void secondTestCase() {

		System.out.println("This is the second Testcase");
		throw new RuntimeErrorException(null);
		

	}
    @Test
	public void thirdTestCase() {

		System.out.println("This is the third Testcase");
		throw new RuntimeErrorException(null);
	}
    @Test
	public void fourthTestCase() {

		System.out.println("This is the fourth Testcase");

	}

}
