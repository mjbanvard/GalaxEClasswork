package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudents {

	public static void main(String[] args) {
		

		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("A", 1, 20));
		students.add(new Student("C", 2, 23));
		students.add(new Student("D", 1, 18));
		students.add(new Student("B", 2, 19));
		
		for(Student s : students) {
			System.out.println(s.name);
		}
		
		System.out.println("------------------------------");
		
		
		Collections.sort(students);
		
		for(Student s : students) {
			System.out.println(s.name);
		}
	}

}
