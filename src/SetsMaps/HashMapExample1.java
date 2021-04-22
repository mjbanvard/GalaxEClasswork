package SetsMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
	
		Map <Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map.get(2));
		
//		Added paramenters to chase away warning markers from STS4
//		
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
		System.out.println("---------------------------------");
		
		for (Map.Entry<Integer, String> entry :  map.entrySet()) {
			System.out.println(entry.getKey()+ ", " + entry.getValue());
		}
		
		System.out.println("---------------------------------");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
			
		}
	}

}
