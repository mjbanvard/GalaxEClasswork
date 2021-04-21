package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequencyExample {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
//		List<String> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		list1.add(1);

//		list2.add("e");
//		list2.add("b");
//		list2.add("g");
//		list2.add("h");

		System.out.println(list1);

		System.out.println(Collections.frequency(list1, 1));

	}

}
