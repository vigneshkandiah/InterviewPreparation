package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamples {


	public void hashmap() {

		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1, "Vignesh");
		map.put(2, "Vignesh");
		map.put(null, "Kani");
		map.put(null, null);


		System.out.println(map);

		HashMap<Integer,String> map1 = new HashMap<Integer,String>();

		map1.putAll(map);

		System.out.println(map1);

		map1.clear();

		System.out.println(map1);

		boolean containsKey = map.containsKey(1);

		System.out.println(containsKey);

		boolean containsKey1 = map.containsValue("Vignesh");

		System.out.println(containsKey1);
		
		
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		
		System.out.println(map.clone());
		
		System.out.println(map3);
		
		Set<Integer> keySet = map.keySet();
		
		System.out.println(keySet);
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		String string = map.get(1);
		
		System.out.println(string);
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		
		
		System.out.println(entrySet);
		
		
		System.out.println("-------------------------");
		
for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey()+entry.getValue());
			
		}
	}


	public static void main(String[] args) {

		HashMapExamples obj = new HashMapExamples();
		obj.hashmap();

	}

}
