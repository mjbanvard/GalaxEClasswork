package SetsMaps;

import java.util.HashMap;

public class HashMapRemoveExample {

	public static void main(String[] args) {
		HashMap <Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		map.remove(2, "B");
		
		System.out.println(map.get(2));
		
//		Set<Map.Entry<Integer, String>> set = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
			
		}
		

	}

}
