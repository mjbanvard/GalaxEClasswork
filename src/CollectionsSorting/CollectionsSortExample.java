package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample {

	public static void main(String[] args) {
//		List<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();

//		list1.add(1);
//		list1.add(3);
//		list1.add(1);
//		list1.add(2);
//		list1.add(1);
//		
		list2.add("e");
		list2.add("b");
		list2.add("g");
		list2.add("h");
		
//		List<String> targetList = new ArrayList<String>();
//		
//		targetList.add("i");
//		targetList.add("e");
//		targetList.add("g");
//		targetList.add("h");
//
		System.out.println(list2);
		
		Collections.sort(list2);
		
		System.out.println(list2);


	}

}
