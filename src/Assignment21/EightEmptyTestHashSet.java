package Assignment21;

import java.util.HashSet;
import java.util.Iterator;

public class EightEmptyTestHashSet {
	
	// 8. Write a Java program to test a hash set is empty or not.

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();

		set.add("One Taco with Chimichurri Sauce");
		set.add("Two Turnip Trucks");
		set.add("Three French Dips");
		set.add("Four baklava");
		set.add("Five Gold Rims");
		set.add("Six Fleets a-sailing");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
		
		// Test to see if the HashSet is empty or not
		if (set.isEmpty()) {
			System.out.println("The set is empty.");
		} else { 
			System.out.println("The set is not empty");
		

		System.out.println("*******************************************");

		set.removeAll(set);

		Iterator<String> itr2 = set.iterator();

		System.out.println("Start the iteration");
		while (itr2.hasNext()) {
			System.out.println("Inside the while loop");
			String value = itr2.next();
			System.out.println(value + "in case there is a NULL");
		}
		
		// Test to see if the HashSet is empty or not
		if (set.isEmpty()) {
			System.out.println("The set is empty.");
		} else { 
			System.out.println("The set is not empty");
			
		System.out.println("*******************************************");
		
		
		}
		}
		}
	}
