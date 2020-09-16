package SeleniumInterviewQuestions;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerfiy {
	@Test
	public void assertTest() {
		
		//hard Assertion Assert 
		
		System.out.println("Before Assertion");
		Assert.fail();
		
		
		System.out.println("After Assertion");
	}
	
	@Test
	public void testVerify() {
		
		
		// Soft Assertion just verify
		
		System.out.println("Before Verfiy");
		SoftAssert assert1 = new SoftAssert();
		
		assert1.fail();
		
		System.out.println("After Assertion");
	}
	

}
