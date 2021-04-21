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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
/*
 * positive integer -> if current object is greater than the specified
 * negative integer -> less than
 * zero -> equals to
 * 
 * 
 */
	@Override
//	public int compareTo(Student o) {
//		
//		return name.compareTo(o.name);
//	}
	
public int compareTo(Student o) {
	if(age == o.age) {
		return 0;
	} else if (age < o.age) {
		return -1;
	} else {
		return 1;
	}

}}
