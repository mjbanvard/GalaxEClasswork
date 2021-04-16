package com.wolfshead.assignments.assig10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeList {
	
	
//	static EmployeeList empList = new EmployeeList();
	static List<Employee> eList = new ArrayList<Employee>();
	
		
	EmployeeList() {}
	
	public static void addEmployee(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		boolean go = true;
		do {
			Employee emp = new Employee();
			System.out.print("Please input full name of new employee : ");
			emp.fName = sc.next();
			if (emp.fName.matches("no")) {
				go = false;
				emp.setlName("more");
//				return;
//				break;
			} else {
				emp.lName = sc.next();
				System.out.println(emp.fName + " " + emp.lName);
				eList.add(emp);
			}
		} while (go);
		//sc.close();
	}
	
	private static void areTheyHere(List<Employee> el, Scanner sc) {
		boolean really = false;
//		String name = "";
		
		System.out.println("Who would you like to find (first name)? ");
//		try {
//		Scanner sc2 = new Scanner(System.in);
		String name = sc.next();
		//sc.next();
//		} catch (NoSuchElementException e) {
//			System.out.println("No Such Element, occurring just after asking for second scanner?");
//		}
		
		for (int i = 0; i < el.size(); i++) {
			if (el.get(i).fName.equals(name)) {
				really = true;
				break;
			}
		}
		if (really) {
			System.out.println("Employee is Registered");
		} else {
			System.out.println("Not Registered");
		}
		
		
				
	}

	private static void printArrayList(List<Employee> el) {
		for (int i = 0; i < el.size(); i++) {
			System.out.println(el.get(i).fName + " " + el.get(i).lName);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's add some employees! Type 'no' to end input.");
		addEmployee(sc);
		System.out.println("*********************************");
		System.out.println("Here is the list of the Employees:");
		printArrayList(eList);
		System.out.println("*********************************");
		areTheyHere(eList, sc);
		sc.close();

	}

	
}
