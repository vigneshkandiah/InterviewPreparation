package JavaConcepts;

public class StaticMethods {


	public static void method1() {

		System.out.println("Static Method 1 ");

	}


	public static void method2() {
		
		// We Cannot Call Non Static Method in Static Method
		// nonStaticMethod();

		System.out.println("Static Method 2 ");

	}
	public void nonStaticMethod() {
		// We Can call Static Methods in Non - Static Methods also
		method1();
		method1();

		System.out.println("Non Static Method");

	}


	public static void main(String[] args) {
		//Accessed in Static Way ( Without Creating Object of the Class ) 
		method1();
		method2();

		//Calling through object of the Class
		StaticMethods obj = new StaticMethods();

		obj.nonStaticMethod();
	}

}
