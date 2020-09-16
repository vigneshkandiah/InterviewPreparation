package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorList1 {
	public void name() {

		List<String> ls=  new ArrayList<String>();

		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");


		System.out.println(ls);


		ListIterator<String> iterator = ls.listIterator();

		while(iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		while(iterator.hasPrevious()) {

			System.out.println(iterator.previous());

		}
		System.out.println("----------------------");
		Iterator<String> it = ls.iterator();

		while(it.hasNext()) {

			System.out.println(it.next());
			
			
		}
		
		List al = new ArrayList();
		
		al.add("string");
		
		al.add(1);
		
		System.out.println(al);
		

	}

	public static void main(String[] args) {
		IteratorList1 obj= new IteratorList1();
		obj.name();


	}

}
