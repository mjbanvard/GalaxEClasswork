package SetsMaps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
		map.put(2, "B");
		map.put(1, "A");
		map.put(3, "C");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
	}

}
