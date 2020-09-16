package JavaStrings;

public class StringImmutable {
	
	
	public static void main(String[] args) {
		
		//1. String Immutable 
		String name="Vicky";//garbage collection
		// In heap the String Name reference just points to Riya and Vicky will be in Heap as garbage
		name="Riya";
		
		System.out.println(name);
	}

}
