package ClassNotes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		
		Iterator<String> itr = set.iterator();
		
		//Not quite sure what should go here
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key/* + " " + set.(key)*/);
		}

	}

}
