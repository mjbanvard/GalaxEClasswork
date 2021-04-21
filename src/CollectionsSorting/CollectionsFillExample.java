package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFillExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
//		List<String> list2 = new ArrayList<>();

		list1.add("A");
		list1.add("b");
		list1.add("c");
		list1.add("d");

//		list2.add("e");
//		list2.add("b");
//		list2.add("g");
//		list2.add("h");

		System.out.println(list1);

		Collections.fill(list1, "E");

		System.out.println(list1);

	}

}
