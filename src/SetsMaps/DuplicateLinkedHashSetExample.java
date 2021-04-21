package SetsMaps;

import java.util.LinkedHashSet;

public class DuplicateLinkedHashSetExample {

	public static void main(String[] args) {
		
	LinkedHashSet<String> set = new LinkedHashSet<>();
	
	set.add("One");
	set.add("Two");
	set.add("Three");
	set.add("Two");
	set.add("Five");
	
	for(String setValue : set) {
		System.out.println(setValue);
	}
}
}