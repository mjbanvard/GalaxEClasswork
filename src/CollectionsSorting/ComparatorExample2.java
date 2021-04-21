package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample2 {

	public static void main(String[] args) {
		
		ArrayList<Student1> list = new ArrayList<Student1>();
		
		list.add(new Student1("A", 1, 20));
		list.add(new Student1("C", 2, 23));
		list.add(new Student1("D", 1, 18));
		list.add(new Student1("B", 2, 19));
		
		
		
		for (Student1 s : list) {
			System.out.println(s.name +s.rollno + s.age);
		}
		
		System.out.println("----------------------");
		
		Comparator<Student1> cs1 = Comparator.comparing(Student1::getName);
		Collections.sort(list, cs1);
		
		for (Student1 s : list) {
			System.out.println(s.name + " " + s.rollno + " " + s.age);
		}
		
		System.out.println("----------------------");
		
		Comparator<Student1> cs2 = Comparator.comparing(Student1::getAge);
		Collections.sort(list, cs2);
		
		for (Student1 s : list) {
			System.out.println(s.name + " " + s.rollno + " " + s.age);
		}
		
		System.out.println("----------------------");
		
		Comparator<Student1> cs3 = Comparator.comparing(Student1::getRollno);
		Collections.sort(list, cs3);
		
		for (Student1 s : list) {
			System.out.println(s.name + " " + s.rollno + " " + s.age);
		}
		
	}

}
