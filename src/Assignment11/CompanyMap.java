package Assignment11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyMap {

	public static void main(String[] args) {
		
		Map<Integer, Company> compMap = new HashMap<Integer, Company>();
		
		Company c1 = new Company (1, "Sump Coffee", "867-5309", "i@am.there", "company info");
		Company c2 = new Company (10, "Earthbound Brewery", "867-5309", "i@am.there", "company info");
		Company c3 = new Company (100, "The Fortune Teller Bar", "867-5309", "i@am.there", "company info");
		Company c4 = new Company (1000, "Yaki's", "867-5309", "i@am.there", "company info");

		compMap.put(1, c4);
		compMap.put(2, c3);
		compMap.put(3, c2);
		compMap.put(4, c1);
		
		for(Integer key : compMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + compMap.get(key).companyName + ", Id: " + compMap.get(key).compId);
		}

		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Scanner sc = new Scanner(System.in);
		String inp = "";
		
		System.out.println("What company are you looking up? ");
		inp = sc.next();
		sc.close();
		boolean found = false;
		
		for(Company c : compMap.values()) {
			if(c.companyName.contains(inp)) {
				System.out.println(c.companyName + "'s Phone Number: " + c.compPhone);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No company found.");
		}
		
		
//		######################NOT DONE###########################
		
//		Iterator itr = compMap.
//		
//		for (Integer intItr : compMap.)
//		if (compMap.get(key).containsValue(inp)) {
//			compMap.get(inp);
//			System.out.println("Insert printout statement here.");
//		} else {
//			System.out.println("This company is not in this list.");
//		};
	}

}
