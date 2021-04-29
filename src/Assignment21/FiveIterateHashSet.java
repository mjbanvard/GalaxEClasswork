package Assignment21;

import java.util.HashSet;
import java.util.Iterator;

public class FiveIterateHashSet {
	
//	5. Write a Java program to iterate through all elements in a hash set.

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("One Taco with Chimichurri Sauce");
		set.add("Two Turnip Trucks");
		set.add("Three French Dips");
		set.add("Four baklava");
		set.add("Five Gold Rims");
		set.add("Six Fleets a-sailing");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
	
	}

}
