package Collection.SET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSET {
	public void hashset() {
		
		
		//HashSET set = new HashSET();
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("a"); //add method is boolean if already added it will not add
		
		set.add(null);
		
		
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		HashSET obj = new HashSET();
		
		obj.hashset();
		
		
	}
	

}
