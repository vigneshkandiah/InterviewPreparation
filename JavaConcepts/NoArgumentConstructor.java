package JavaConcepts;



public class NoArgumentConstructor {
	
	int employee_id;
	String emp_Name;
	
	//No Argument Constructor
	NoArgumentConstructor(){
		employee_id=100;
		emp_Name="Vignesh Kandiah";
		System.out.println("NoArgumentConstructor Object is Created");
	}
	
	public static void main(String[] args) {
		
		NoArgumentConstructor obj = new NoArgumentConstructor();
		
	}
	

}
