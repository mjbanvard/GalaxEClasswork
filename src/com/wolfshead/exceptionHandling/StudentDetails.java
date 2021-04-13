package com.wolfshead.exceptionHandling;

import java.sql.SQLException;

public class StudentDetails {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		try {
			ss.saveStudent();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println();
		}
	}

}
