package CollectionsSorting;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student1>{

	public int compare(Student1 o1, Student1 o2) {
		Student1 s1 = o1;
		Student1 s2 = o2;
		
		if (s1.rollno == s2.rollno) {
			return 0;
		} else if (s1.rollno > s2.rollno) {
			return 1;
		}else {
			return -1;
		}
}}
