package Collection.SET;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSETExmamples {
	
public void treeset() {
		
		
		//HashSET set = new HashSET();
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(9);
		set.add(8); //add method is boolean if already added it will not add
		
	
		SortedSet<Integer> headSet = set.headSet(5);
		
		System.out.println(set);
		
		System.out.println(headSet);
		
		SortedSet<Integer> tailSet = set.tailSet(4);
		
		System.out.println(tailSet);
		
		Iterator<Integer> iterator = set.iterator();
		
		Comparator<? super Integer> comparator = set.comparator();
		
		System.out.println(comparator);
		
		Integer higher = set.higher(3);
		
		System.out.println(higher);
		
		Iterator<Integer>  iterator1 = set.descendingIterator();
		
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		TreeSETExmamples obj = new TreeSETExmamples();
		
		obj.treeset();
		
		
	}

}
