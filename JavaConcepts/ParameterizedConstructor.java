package JavaConcepts;

public class ParameterizedConstructor {

	String animal_Name;
	String animal_Type;
	//Parameterized Constructor
	ParameterizedConstructor(String name,String type){

		this.animal_Name=name;
		this.animal_Type=type;

	}

	public void sayAboutAnimal() {


		System.out.println("Animal Name is :" +animal_Name+"    Animal Type is: "+animal_Type);

	}



	public static void main(String[] args) {

		ParameterizedConstructor obj = new ParameterizedConstructor("Duck", "Omnivores");

		obj.sayAboutAnimal();

		ParameterizedConstructor obj1 = new ParameterizedConstructor("Donkey", "Omnivores");

		obj1.sayAboutAnimal();
	}

}
