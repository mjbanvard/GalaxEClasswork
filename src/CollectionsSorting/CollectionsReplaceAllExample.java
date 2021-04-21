package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReplaceAllExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
//		List<String> list2 = new ArrayList<>();

		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.add("One");
		list1.add("One");
		
//		list2.add("e");
//		list2.add("b");
//		list2.add("g");
//		list2.add("h");

		System.out.println(list1);
		
		Collections.replaceAll(list1, "One", "Four");
		
		System.out.println(list1);

	}

}
