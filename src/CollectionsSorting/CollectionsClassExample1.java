package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Def");
		
		Collections.addAll(list, "Ghe", "jkl");
		
		for(String name : list) {
			System.out.println(name);
		}
	}

}
