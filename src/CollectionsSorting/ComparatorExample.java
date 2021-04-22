package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Student1> list = new ArrayList<Student1>();

		list.add(new Student1("A", 1, 20));
		list.add(new Student1("C", 2, 23));
		list.add(new Student1("D", 1, 18));
		list.add(new Student1("B", 2, 19));

		Iterator<Student1> itr = list.iterator();
		while (itr.hasNext()) {
			Student1 student = (Student1) itr.next();
			System.out.println(student.name);
		}

		System.out.println("------------------------------");

		for (Student1 s : list) {
			System.out.println(s.name);
		}

		System.out.println("------------------------------");

		Collections.sort(list, new AgeComparator());

		for (Student1 s : list) {
			System.out.println(s.name);
		}

	}

}
