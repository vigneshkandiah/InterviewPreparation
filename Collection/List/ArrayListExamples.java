package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
	
public void arrayList() {
		
		List <String>  arrayList= new ArrayList<String>();
		arrayList.add("Isuzu");
		arrayList.add("Benz");
		arrayList.add("Audi");
		arrayList.add("BMW");
		arrayList.add("BMW");
		
		
		System.out.println(arrayList.get(1));
		
		int indexOf = arrayList.indexOf("BMW");
		
		int lastIndexOf = arrayList.lastIndexOf("Benz");
		
		int lastIndexOf2 = arrayList.lastIndexOf("abc");
		
		System.out.println(lastIndexOf2);
		
		System.out.println(lastIndexOf);
		
		System.out.println(indexOf);
		
		System.out.println(arrayList);
		
		List<String>  ob3= new ArrayList<String>();
		ob3.addAll(arrayList);
		
		System.out.println(ob3);
		
		ob3.remove(2);
		
		ob3.add("BMW");
		
		ob3.remove("BMW");
		ob3.add(4, "MG Hector");
		
		ob3.remove(4);
		
		ob3.add(null);
		
		ob3.set(0, "Ferrari");
		
		
//		ob3.clear();
//		
     System.out.println(ob3);
     
     boolean empty = ob3.isEmpty();
     
     System.out.println(empty);
     
     
     
     for (String each : ob3) {
    	 
    	 System.out.println(each);
		
	}
     
     for (int i = 0; i < ob3.size(); i++) {
    	 
    	 
    	 System.out.println(ob3.get(i));
    	 
    	 
		
	}
     
     ListIterator<String> iterator = ob3.listIterator();
     
     while(iterator.hasNext()) {
     	
     	System.out.println(iterator.next());
     }
    
		
		
		
		
	}

       
       
       

 	
	public static void main(String[] args) {
		
		ArrayListExamples obj = new ArrayListExamples();
		obj.arrayList() ;
	

}
}