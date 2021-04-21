package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDisjointExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();

		list1.add("A");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		list2.add("e");
		list2.add("b");
		list2.add("g");
		list2.add("h");
		
		boolean isCommon = Collections.disjoint(list1, list2);
		System.out.println(isCommon);
	}

}
