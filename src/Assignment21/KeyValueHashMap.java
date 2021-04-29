package Assignment21;

import java.util.HashMap;
import java.util.Map;

public class KeyValueHashMap {
	
	// 9. Write a Java program to associate the specified value with the specified key in a Hash Map.

	public static void main(String[] args) {
		
Map <Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(82, "F");
		
		
		for (int i = 0; i < map.size(); i ++) {
			System.out.println(map.get(i));
		}

	}

}
