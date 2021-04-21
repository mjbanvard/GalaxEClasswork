package Assignment11;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {


		@Override
		public int compare(Employee o1, Employee o2) {
			Employee s1 = o1;
			Employee s2 = o2;
			
			if (s1.salary == s2.salary) {
				return 0;
			} else if (s1.salary > s2.salary) {
				return 1;
			} else {
				return -1;
			}
		}
			
			public static void main(String[] args) {
				
				
			}

}
