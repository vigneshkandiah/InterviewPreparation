package JavaConcepts;

public class StaticBlock {
	
	//Static Block Will Get Executed Before Object Of Class Is Created.
	// A Class can have Multiple Static Blocks.
	//Static Blocks are used to initialize the static variables.
	
	static {
		System.out.println("The Static Block 1");
		
	}
	
	static {
		System.out.println("The Static Block 2");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main Method");
		
	}

}
