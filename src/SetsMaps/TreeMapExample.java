package SetsMaps;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "A");
		map.put(5, "E");
		map.put(4, "D");
		map.put(2, "B");
		map.put(3, "C");
		
		for(Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		System.out.println(map.descendingMap());
		
		System.out.println(map.tailMap(3));
		
		System.out.println(map.headMap(3));

	}

}
