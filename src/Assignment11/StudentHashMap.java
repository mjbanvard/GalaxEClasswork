package Assignment11;

import java.util.HashMap;

public class StudentHashMap {
	
	// QUESTION 3

	public static void main(String[] args) {
		
		HashMap<Integer, Student> studHash = new HashMap<Integer, Student>();
		
		Student s1 = new Student("Henry Shaw", 2001, 150);
		Student s2 = new Student("Dame Pence", 3485, 43);
		Student s3 = new Student("Isaac Asimov", 23, 96);
		Student s4 = new Student("Rita Franklin", 3456, 75);
		
		studHash.put(1, s4);
		studHash.put(3, s2);
		studHash.put(4, s3);
		studHash.put(2, s1);
		
		for(Student s : studHash.values()) {
			try {System.out.println("Name: " + s.name + 
					", Roll No.: " + s.rollNo + ", Age: " + s.age);}
			catch (ClassCastException e) {
				System.out.println("Can't cast Student to Comparable");
			}
		}
		
		
	}

}
