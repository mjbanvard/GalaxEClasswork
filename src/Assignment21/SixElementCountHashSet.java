package Assignment21;

import java.util.HashSet;
import java.util.Iterator;

public class SixElementCountHashSet {
	
//	6. Write a Java program to get the number of elements in a hash set.

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
		
		System.out.println("The above set has " + set.size() + " elements in it.");
		
	
	}

}
