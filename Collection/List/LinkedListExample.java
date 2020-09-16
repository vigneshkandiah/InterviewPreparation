package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public void linkedlIst() {
	
	List<Integer>  ls = new LinkedList<Integer>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	
	ls.remove(1);
	
	System.out.println(ls);
	
	ls.get(0);
	
	System.out.println("---------------");
	
	for (int i = 0; i < ls.size(); i++) {
		
		System.out.println(ls.get(i));
		
	}
	System.out.println("---------------");
	for (Integer each : ls) {
		
		System.out.println(each);
		
	}
	
	
	
	
	}
	
	public static void main(String[] args) {
		
		LinkedListExample obj = new LinkedListExample();
		obj.linkedlIst();
	}
	
	
	

}
