package com.wolfshead.exceptionHandling;

import java.sql.SQLException;

public class StudentRepo {

	void saveStudent(StudentDetails sd) throws SQLException {
		System.out.println("Student is Saved");
	}	

}
