package com.RestAssuredClass;

public class Enrollment implements Student{

	public static void main(String[] args) {

	}

	@Override
	public void displayName() {
		System.out.println("This is my name");
		
	}

	@Override
	public void getId() {
		System.out.println("This is my name");
		
	}

	@Override
	public void getPhoneNumber() {
		System.out.println("867-5309");	
	}
	
	public void getUniversity() {
		System.out.println("University: " + Student.school);
	}

}
