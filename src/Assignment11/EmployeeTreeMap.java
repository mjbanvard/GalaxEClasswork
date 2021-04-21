package Assignment11;

import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>();
		
		Employee e1 = new Employee(782, "George", "Smith", "Manager", "Sales", "Sump Coffee", 35000);
		Employee e2 = new Employee(123, "Paul", "Reed", "Service Desk", "Service", "Sump Coffee", 37000);
		Employee e3 = new Employee(54, "Ringo", "Steel", "Owner", "Management", "Sump Coffee", 55000);
		Employee e4 = new Employee(89, "John", "Angus", "Bartender", "Sales", "Earthbound Brewery", 42000);
		Employee e5 = new Employee(23, "Laurel", "Stan", "Waitress", "Sales", "Earthbound Brewery", 48000);
		Employee e6 = new Employee(53, "Hardy", "Ford", "Owner", "Management", "Earthbound Brewery", 60000);
		
		empMap.put(1, e5);
		empMap.put(2, e6);
		empMap.put(3, e3);
		empMap.put(4, e2);
		empMap.put(5, e4);
		empMap.put(6, e1);
	
		System.out.println("This is a list of employees, sorted by id number:");
		for(Integer key : empMap.keySet()) {
			System.out.println("Key: " + key + ", Name: " + empMap.get(key).firstName + ", Company: " + empMap.get(key).companyName + ", Employee number: " + empMap.get(key).id);
		}
		
		System.out.println("********************************");
		
		System.out.println("This is a list of employees, printed with salary as the first listing:");
		
		for(Employee emp : empMap.values()) {
			try {System.out.println("Salary: " + emp.salary + ", Name: " + emp.firstName + 
					", Company: " + emp.companyName + ", Employee number: " + emp.id);}
			catch (ClassCastException e) {
				System.out.println("Can't cast Employee to Comparable");
			}
		}
		
//		System.out.println("---------------------------------");
//		
//		
//		
//		TreeMap<Integer, Employee> salEmpMap = new TreeMap<Integer, Employee>();
//		
//		for(Employee emp : empMap.values()) {
//			try {System.out.println("Salary: " + emp.salary + ", Name: " + emp.firstName + 
//					", Company: " + emp.companyName + ", Employee number: " + emp.id);}
//			catch (ClassCastException e) {
//				System.out.println("Can't cast Employee to Comparable");
//			}
//		}
//		
	}

	
	

}
