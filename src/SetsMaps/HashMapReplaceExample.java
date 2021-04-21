package SetsMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplaceExample {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
		System.out.println("______________________________");
		
		map.replace(3, "E");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
		System.out.println("______________________________");
		
		map.replace(3, "E", "F");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
		
	}

}
