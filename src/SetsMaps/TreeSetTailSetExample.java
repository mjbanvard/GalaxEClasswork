package SetsMaps;

import java.util.TreeSet;

public class TreeSetTailSetExample {

	public static void main(String[] args) {

		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("A");
		set.add("E");
		set.add("T");
		set.add("H");
		set.add("M");
		
		System.out.println("TailSet: " + set.tailSet("H"));
	}

}
