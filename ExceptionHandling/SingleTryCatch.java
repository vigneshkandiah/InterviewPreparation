package ExceptionHandling;

public class SingleTryCatch {
	
	
	public static void main(String[] args) {
		
		try {
			int num1 =0;
			
			int num2=12;
			
			int result= num2/num1;
			
			System.out.println(result);
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			System.out.println("Single try catch cutomized Message");
		}
	}

}
