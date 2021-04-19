package ClassNotes;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Foure");
		list.add("Five");
		
		HashSet<String> set = new HashSet<String>(list);
		
		if(set.contains("One")) {
			System.out.println("True");
		}
		
	}

}
