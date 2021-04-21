package SetsMaps;

import java.util.HashSet;

public class HashSetSExample3 {

	public static void main(String[] args) {
	HashSet<Book> set = new HashSet<Book> ();
	
	Book b1 = new Book(1, "Name", "Author", "Publisher");
	Book b2 = new Book(2, "Name", "Author", "Publisher");
	Book b3 = new Book(3, "Name", "Author", "Publisher");
	
	set.add(b1);
	set.add(b2);
	set.add(b3);
	
	for (Book book : set) {
		System.out.println("id =>" + book.id);
	}
	
	
	}

}
