package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExamples {


	public void linkedHashMap() {

		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

		map.put(1, "Vignesh");
		map.put(2, "Kandiah");
		map.put(null, null);
		map.put(null, "kani");


		System.out.println(map);
		
		
		
		

	}

	public static void main(String[] args) {

		LinkedHashMapExamples obj = new LinkedHashMapExamples();
		obj.linkedHashMap();

	}

}


