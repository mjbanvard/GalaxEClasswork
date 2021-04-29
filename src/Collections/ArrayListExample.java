package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		int[] array1 = new int[100]; // Fixed length array
		array1[0] = 23;
		System.out.println(array1[0]);
		
		final List<Integer> parentList = new ArrayList<Integer>(); // cannot reinstantiate list
		final List<Integer> childList = new ArrayList<Integer>();
		
		parentList.add(20);
		parentList.add(40);
		parentList.add(60);
		parentList.add(80);
		parentList.add(100);
		parentList.add(120);
		
//		parentList = new ArrayList<Integer>(); //clears array and creates new empty array
		
		System.out.println("size of parentList = "+ parentList.size());
		
		childList.add(10);
		childList.add(20);
		childList.add(30);
		childList.add(40);
		childList.add(50);
		childList.add(60);
		
		System.out.println("size of childList = "+ childList.size());
		
		int ind = childList.indexOf(50);
		childList.remove(ind);
		System.out.println(childList);
		
		parentList.addAll(3, childList);
		
		System.out.println("size of parentList = "+ parentList.size());
		System.out.println(parentList);
		 
		if (parentList.contains(20)) {
			System.out.println("found in list");
		} else {
			System.out.println("NOT found in list");
		}
		
		//int index = 1;
		
//		if (parentList != null && index < parentList.size()) {
//			parentList.remove(index);
//		
//			System.out.println(parentList);
//		}
		
		childList.set(0, 80);
		System.out.println(childList);
		
		parentList.retainAll(childList); //whatever is common in lists is kept, everything else dropped.
		System.out.println(parentList);
		
		parentList.removeAll(childList);
		System.out.println(parentList);
		
		Object[] array = (Object[]) parentList.toArray(); // Manual Type casting
		System.out.println(array);
		System.out.println("size of array = " + array.length);
		
		if(parentList.isEmpty()) {
			System.out.println("The list is without contents");
		}
	}
		
	public static List<Integer> factory(int flag) {
			List<Integer> list = null;	
		//******************************************************
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(25);
		
		list = new ArrayList<Integer>();
		List<Integer> sameList = new ArrayList<Integer>(); //As many as you want. GROWING ARRAY.
		
		list.add(25);
		System.out.println(list.get(0));
	
	
	
//	 list.add(); 
//	 list.addAll();
	 /* .contains
	 * .containsAll
	 * .remove
	 * .removeAll
	 * .clear - clears all values, returning empty list.
	 * .isEmpty
	 * .size
	 * .replace
	 * .retainAll
	 * .toArray
	 * .set
	 * .indexOf
	 * .subList
	 */

	
		
		if (flag == 1) {
			list = new ArrayList<Integer>();
		} else {
			list = new LinkedList<Integer>();
		}
		return list;
	}

}



