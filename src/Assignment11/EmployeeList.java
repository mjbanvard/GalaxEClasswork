package Assignment11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
	
	
	public static void main(String[] args) {
		
	
	List<Employee> employees = new ArrayList<Employee>();

	
	employees.add(new Employee(02, "Nick", "Smith", "Manager", "Sales", "Sump Coffee", 45000));
	employees.add(new Employee(04, "Audra", "Jones", "Drudge", "Sales", "Earthbound Brewery", 35000));
	employees.add(new Employee(06, "Miles", "Adams", "Manager", "Sales", "Earthbound Brewery", 45000));
	employees.add(new Employee(07, "Luke", "Sky", "Owner", "Management", "Sump Coffee", 75000));
	
	for(Employee e : employees) {
		System.out.println(e.firstName + " " + e.id + " " + e.salary);
	}
	
	System.out.println("---------------------------------");

	Collections.sort(employees, new SalaryComparator() );

	for(Employee e : employees) {
		System.out.println(e.firstName + " " + e.id + " " + e.salary);
	}
	
	}


}
