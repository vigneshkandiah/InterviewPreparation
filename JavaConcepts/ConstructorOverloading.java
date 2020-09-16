package JavaConcepts;

public class ConstructorOverloading {
	String draw;
	
	//Constructor Overloading
	
	ConstructorOverloading(){
		
		System.out.println("ConstructorOverloading Object created");
	}
	ConstructorOverloading(String toDraw){
		
		this.draw=toDraw;
		
		System.out.println("Drawing "+toDraw);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading("Circle");
		
		
	}
	
	
	

}
