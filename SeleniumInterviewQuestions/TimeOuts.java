package SeleniumInterviewQuestions;

import org.testng.annotations.Test;

public class TimeOuts {
	@Test(timeOut = 2000)
	public void Testcase() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Vignesh Kandiah");
		
	}

}
