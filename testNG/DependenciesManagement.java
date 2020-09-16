package testNG;
import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test()
	public void highSchool() {

		System.out.println("highSchool");
		
		throw new RuntimeErrorException(null) ;

	}

	@Test(dependsOnMethods ="highSchool")
	public void higherSecondary() {

		System.out.println("higherSecondary");

	}
	@Test(dependsOnMethods = "higherSecondary")
	public void college() {

		System.out.println("college");



	}


}
