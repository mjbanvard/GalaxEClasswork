package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassCopeExample2 {

	public static void main(String[] args) {
		List<Integer> srclist = new ArrayList<Integer>();
		srclist.add(1);
		srclist.add(2);
		
		List<Integer> destlist = new ArrayList<Integer>();
		destlist.add(3);
		destlist.add(4);
		
		Collections.copy(destlist, srclist);
		
//		for(String name : list) {
//			System.out.println(name);
			
			System.out.println(srclist);
			System.out.println(destlist);


	}

}
