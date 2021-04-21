package SetsMaps;

import java.util.HashSet;

public class HashSetRemoveExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		set.remove("Three");
		
		set.add("Three");
		set.add("Six");
		
		for (String setValue : set) {
			System.out.println(setValue);
		}

	}

}
