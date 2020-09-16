package JavaConcepts;

public class ReturnTypes {
	
	public Integer Collectionamount=1000;
	
	public Integer CollectAmountAndGiveItToMe(){
		System.out.println("Daddy I have collected amount and send it to you " + Collectionamount);
		return Collectionamount;
			
	}
	
	public static void main(String[] args) {
		
		ReturnTypes mySon= new ReturnTypes();
		Integer amount = mySon.CollectAmountAndGiveItToMe();
		
		System.out.println("I got the Amount my Son " +amount);
		
	}

}
