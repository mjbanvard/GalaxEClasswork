package com.wolfshead.exceptionHandling;

import java.sql.SQLException;

public class StudentService {

	void saveStudent() throws SQLException {
		StudentDetails sd = new StudentDetails();
		StudentRepo sr = new StudentRepo();
		
		sr.saveStudent(sd);
	}

}
