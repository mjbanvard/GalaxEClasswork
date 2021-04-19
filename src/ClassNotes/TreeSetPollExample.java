package ClassNotes;

import java.util.TreeSet;

public class TreeSetPollExample {

	
	public static void main(String[] args) {
		
	TreeSet<Integer> set = new TreeSet<Integer>();
	
	set.add(21);
	set.add(45);
	set.add(75);
	set.add(13);
	set.add(2);
	set.add(78);
	
	
	System.out.println("Highest: " + set.pollFirst());
	System.out.println("Lowest: "  + set.pollLast());
	
	}
	
	
	
}
