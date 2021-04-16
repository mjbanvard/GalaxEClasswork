package com.wolfshead.assignments.assig05;

public class StudentInfo implements StudentSpec{

	Student s = new Student();
	
	@Override
	public void saveInformation() {
		System.out.println("The data has been saved.");
	}

	@Override
	public void createInformation() {
		
		// This method could also have a Scanner in it, to take input.
		s.rollNo = 1;
		s.firstName = "George";
		s.lastName = "Carlin";
		s.department = "Comedy";
		s.free = true;
		s.age = 76;
	}

	@Override
	public void showStudentInfo() {

		System.out.println(s.rollNo);
		System.out.println(s.firstName + " " + s.lastName);
		System.out.println(s.department);
		System.out.println(s.free);
		System.out.println(s.age);
		
	}

	public static void main(String[] args) {
		StudentInfo info = new StudentInfo();
		
		info.createInformation();
		info.showStudentInfo();
		info.saveInformation();
		
	}
}
