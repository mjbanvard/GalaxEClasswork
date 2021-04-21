package SetsMaps;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDuplicateExample {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	set.add("One");
	set.add("Two");
	set.add("One");
	set.add("Four");
	set.add("Five");
	
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	for(String setValue : set) {
		System.out.println(setValue);
	}
	
//	Not sure what this iteration example was going to do.
//	for (int i =0; i < set.size(); i ++) {
//		System.out.println(set.);
//	}
	}

}
