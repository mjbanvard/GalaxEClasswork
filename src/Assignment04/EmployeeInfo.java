package Assignment04;

public class EmployeeInfo extends Employee {

	EmployeeInfo() {
		this.empId = 1;
		this.firstName = "Adam";
		this.lastName = "Smith";
		this.salary = 60000;
		this.department = "Sales";
		this.address = "123 1st St, New York, NY 12345";
	}
	
	EmployeeInfo(int empId, String firstName, String lastName, int salary, String department, String address) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}
	
	public static void printInfo(EmployeeInfo emp) {
		 System.out.println(emp.empId);
		 System.out.println(emp.firstName);
		 System.out.println(emp.lastName);
		 System.out.println(emp.salary);
		 System.out.println(emp.department);
		 System.out.println(emp.address);
		 
	}

	public static void main(String[] args) {
		
		EmployeeInfo emp1 = new EmployeeInfo();
		printInfo(emp1);
	}

}
