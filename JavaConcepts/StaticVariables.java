package JavaConcepts;

public class StaticVariables {

	static int account_Balance=100;

	String deposited_by;


	public static void main(String[] args) {

		StaticVariables obj1 = new StaticVariables();

		obj1.deposited_by="vicky";
		obj1.account_Balance=1000;

		StaticVariables obj2 = new StaticVariables();

		obj2.deposited_by="Kani";
		obj2.account_Balance=2000;
		
		// Static variable is common to all objects of the class
		//Second obj overwrite the value of account Balance of Vicky as it is static variable
		
		System.out.println("Object 1 Integer " +obj1.account_Balance);
		System.out.println("Object 1 String " +obj1.deposited_by);
		System.out.println("Object 2 Integer " +obj2.account_Balance);
		System.out.println("Object 2 String " +obj2.deposited_by);
	}

}
