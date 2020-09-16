package MAP;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExamples {
	
	
	public void treeMap() {

		TreeMap<Integer,String> map = new TreeMap<Integer,String>();

		map.put(1, "Vignesh");
		map.put(2, "Kandiah");
		map.put(3, "Suresh");
		map.put(3, "Kani");


		System.out.println(map);
		
		
		
		

	}
	
	public static void main(String[] args) {
		TreeMapExamples obj = new TreeMapExamples();
		
		obj.treeMap();
		
		
		
		
	}

}
