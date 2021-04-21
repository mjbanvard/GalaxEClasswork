package Assignment5;

public class Student {
	
	int rollNo;
	String firstName;
	String lastName;
	String department;
	boolean free;
	int age;
	
	Student() {}
	
	Student(int rollNo, String firstName, String lastName, String department, boolean free, int age) {
		
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.free = free;
		this.age = age;
		
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
//		Student s = new Student();
		
	}

}
