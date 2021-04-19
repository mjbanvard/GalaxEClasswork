package ClassNotes;

import java.util.LinkedHashSet;

public class DuplicateLinkedHashSetExample {

	LinkedHashSet<String> set = new LinkedHashSet<>();
	
	set.add("One");
	set.add("Two");
	set.add("Three");
	set.add("Four");
	set.add("Five");
	
	for(String setValue : set) {
		System.out.println(setValue);
	}
}
