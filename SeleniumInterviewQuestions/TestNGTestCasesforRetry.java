package SeleniumInterviewQuestions;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNGTestCasesforRetry {
	@Test
	public void TestCase1() {

		System.out.println("TestCase1");

	}
	@Test()
	public void TestCase2() {

		System.out.println("TestCase2");
		
		Assert.assertTrue(false);

	}

}
