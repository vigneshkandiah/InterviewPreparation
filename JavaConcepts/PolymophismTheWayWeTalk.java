package JavaConcepts;



public class PolymophismTheWayWeTalk {


	public void talk(Parents speakingStyle) {

		System.out.println("Polite and Respectful");

	}

	public void talk(Partner speakingStyle) {

		System.out.println("Love, Romantic, Mixture Feelings");

	}

	public void talk(Boss speakingStyle) {

		System.out.println("Nothing Personal, Pure Business");



	}


	public static void main(String[] args) {


		PolymophismTheWayWeTalk obj = new PolymophismTheWayWeTalk();

		Parents obj1 = new Parents();
		//Method Overloading
		obj.talk(obj1);

		Boss obj2 = new Boss();
		//Method Overloading
		obj.talk(obj2);

		Partner obj3 = new Partner();
		//Method Overloading
		obj.talk(obj3);




	}
}
