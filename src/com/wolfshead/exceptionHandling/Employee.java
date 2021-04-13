package com.wolfshead.exceptionHandling;

public class Employee {

	public static void main(String[] args) {
		Employee emp = new Employee();	                                   ;
		callMyMethod(emp);
		
	}
	
	private static void callMyMethod(Employee employee) {
		String username = "admin";
		String password = "admin";
		
		try {
			employee.show(username, password);
			System.out.println("Did it work?");
			//any amount of code
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("This is inside the Null Pointer Exception catch block");	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("this is finally block");
		}
		
		System.out.println("Printing after try-catch-finally method");
	}
	
	private void show(String username, String password) throws Exception {
		if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
		System.out.println("This is for exception handling");
		} else {
			throw new Exception ("This is not a vaild user");
		}
	}

}
