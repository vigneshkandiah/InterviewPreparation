package SeleniumInterviewQuestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionsInTestNG {
	
	
		@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
		public void Testcase() throws InterruptedException {
			Thread.sleep(3000);
			System.out.println("Vignesh Kandiah");
			
		}

	}


