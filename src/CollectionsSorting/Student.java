package CollectionsSorting;

public class Student implements Comparable<Student>{

	String name;
	int rollno;
	int age;
	
	
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student o) {
		if(age == o.age) {
			return 0;
		} else if (age < o.age) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {

	}
/*
 * positive integer -> if current object is greater than the specified
 * negative integer -> less than
 * zero -> equals to
 * 
 * 
 */
	
//	public int compareTo(Student o) {
//		
//		return name.compareTo(o.name);
//	}
	

}
