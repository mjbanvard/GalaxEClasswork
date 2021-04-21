package Assignment11;

public class Employee {

	int id;
	String firstName;
	String lastName;
	String jobTitle;
	String department;
	String companyName;
	int salary;
	
	Employee(){}
	
	Employee(int id, String firstName, String lastName, String jobTitle, String department, String companyName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.companyName = companyName;
		this.salary = salary;
	}

}


