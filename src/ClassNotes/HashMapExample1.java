package ClassNotes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
	
		Map <Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map.get(2));
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
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
