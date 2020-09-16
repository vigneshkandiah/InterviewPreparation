package JavaConcepts;

public class PolymorphismSon extends PolymorphismParents{
	//Overriding at subclass ( Implementation of a method changed in sub class)
	@Override 
	public void marriage() {
		
		System.out.println(" He choose his own Partner");
		
	}
	
	public static void main(String[] args) {
		
		PolymorphismParents parents = new PolymorphismSon();
		parents.marriage();
		parents.properties();
		
		
		
		
		
	}

}
