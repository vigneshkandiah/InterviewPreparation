package StringBuilder;

public class StringBuilder1 {
	
	public static void main(String[] args) {
		System.out.println("The StringBuilder is mutable:");
		StringBuilder sb= new StringBuilder("Arya");
		
		//1.reverse()
				StringBuilder reverse = sb.reverse();
				
				
				System.out.println(reverse);
				
				//2.append()
				
				StringBuilder append = sb.append("Kani");
				
				System.out.println(append);
				
				StringBuilder replace = sb.replace(0, 3, "Riya");
				
				//3.replace(start,end,string)
				System.out.println(replace);
				
				//4.insert(index,String)
				
				StringBuilder insert = sb.insert(4,"Kandiah");
				
				System.out.println(insert);
				
				//4.delete(start,end)
				
				StringBuilder delete = sb.delete(3, 5);
				
				System.out.println(delete);
				
				//5.capacity()
				
				int capacity = insert.capacity();
				
				System.out.println(capacity);
				
				
				
				
				
				//charAt,subString,length
	}

}
