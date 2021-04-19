package ClassNotes;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
	
		TreeSet<String> set = new TreeSet<>();
		
		set.add("A");
		set.add("E");
		set.add("T");
		set.add("H");
		set.add("M");
		
		System.out.println("Reverse: " + set.descendingSet());
		
	}

}
