package ClassNotes;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {

		//TreeSet will be sorted.
		
		TreeSet<String> set = new TreeSet<String> ();
		
		set.add("A");
		set.add("V");
		set.add("D");
		set.add("T");
		set.add("E");
		
		TreeSet<Integer> set1 = new TreeSet<Integer> ();
		
		set1.add(4);
		set1.add(3);
		set1.add(2);
		set1.add(5);
		set1.add(1);
		
		for (Integer treeSetValue : set1) {
			System.out.println(treeSetValue);
		}
		
	}

}
