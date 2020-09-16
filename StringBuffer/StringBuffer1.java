package StringBuffer;

public class StringBuffer1 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("The String is Immutable:");
		String name= "Arya";
		
		System.out.println("The Concatenated Name :"+name.concat("Prasath"));
		
		System.out.println("The Original Name :"+name);
		
		System.out.println("The StringBuffer is mutable:");
		
		StringBuffer sb= new StringBuffer("Vicky");   
		//1.reverse()
		StringBuffer reverse = sb.reverse();
		
		
		System.out.println(reverse);
		
		//2.append()
		
		StringBuffer append = sb.append("Kani");
		
		System.out.println(append);
		
		StringBuffer replace = sb.replace(0, 3, "Riya");
		
		//3.replace(start,end,string)
		System.out.println(replace);
		
		//4.insert(index,String)
		
		StringBuffer insert = sb.insert(4,"Kandiah");
		
		System.out.println(insert);
		
		//4.delete(start,end)
		
		StringBuffer delete = sb.delete(3, 5);
		
		System.out.println(delete);
		
		//5.capacity()
		
		int capacity = insert.capacity();
		
		System.out.println(capacity);
		
		System.out.println("The Concatenated Name :"+name.concat("Prasath"));
		
		System.out.println("The Original Name :"+name);
		
		
		//charAt,subString,length
		
		
		
	}

	

}
