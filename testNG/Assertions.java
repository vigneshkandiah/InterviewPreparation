package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertions {
	@Test
	public void name() {
		
String name="Agni";

boolean value = false;
//		
//		
//		if(name.equals("Agni")) {
//			
//			System.out.println("Name is Equal");
//		}else {
//			
//			System.out.println("Name is not Equal");
//		}
//		
//	}
	Assert.assertEquals(name, "Agni");
	Assert.assertFalse(value, "This should not be true");
	
	Assert.assertSame(value, "123");
	
	
	
	
	}

}
