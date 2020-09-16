package SeleniumInterviewQuestions;

import org.testng.annotations.Test;

public class AlwaysRunInTestNG {
	@Test(timeOut=2000)
	public void parentsPermission() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Permission Given");
		
	}
	
	@Test(dependsOnMethods = "parentsPermission",alwaysRun = true)
	public void loveMarriage() {
		
		System.out.println("Marriage Happened");
		
	}

}
