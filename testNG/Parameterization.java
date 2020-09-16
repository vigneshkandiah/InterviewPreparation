package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	@Parameters({"Name"})
	@Test
	public void printName(String lname) {
		
		System.out.println("Name is " +lname);
		
	}

}
