package CollectionsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassCopyExample {

	public static void main(String[] args) {
		List<String> srclist = new ArrayList<String>();
		srclist.add("Abc");
		srclist.add("Def");
		
		List<String> destlist = new ArrayList<String>();
		destlist.add("GHi");
		destlist.add("Jkl");
		
		Collections.copy(srclist, destlist);
		
//		for(String name : list) {
//			System.out.println(name);
			
			System.out.println(srclist);
			System.out.println(destlist);

	}

}
