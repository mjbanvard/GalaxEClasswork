package ClassNotes;

import java.util.LinkedHashMap;

public class LinkedHashMapBookExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Book> map = new LinkedHashMap<Integer, Book>();
		
		Book b1 = new Book(1, "Name", "Author", "Publisher");
		Book b2 = new Book(2, "Name", "Author", "Publisher");
		Book b3 = new Book(3, "Name", "Author", "Publisher");
		
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
//		Iterable itr = map.keySet();
		
		
//		for (Book book : map.get(book)) {
//			System.out.println("id =>" + book.id);
//		}

		for(Integer key : map.keySet()) {
			System.out.println("Key: " + key + ", Id: " + map.get(key).id + ", Book Name: " + map.get(key).name + ", Publisher: " + map.get(key).publisher);
		}
	}

}
