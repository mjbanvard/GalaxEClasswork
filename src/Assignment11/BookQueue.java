package Assignment11;

import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {
	
	// QUESTION 4

	public static void main(String[] args) {

		Queue<Book> bookQueue = new LinkedList<>();
		
		Book b1 = new Book(823, "Moby Dick", "Melville", "Random House");
		Book b2 = new Book(943287, "Oliver", "Dickens", "Penguin");
		Book b3 = new Book(9876435, "Odyssey", "Homer", "Random House");
		Book b4 = new Book(12334, "Jump", "Kanga Roo", "Penguin");
		Book b5 = new Book(5687, "One", "Bach", "Random House");
		
		bookQueue.add(b4);
		bookQueue.add(b2);
		bookQueue.add(b5);
		bookQueue.add(b1);
		bookQueue.add(b3);
		
		for (Book b : bookQueue) {
			System.out.println(b.name + ",  written by " + b.author + ", published by " + b.publisher);
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		bookQueue.poll();
		
		for (Book b : bookQueue) {
			System.out.println(b.name + ",  written by " + b.author + ", published by " + b.publisher);
		}
		
	}

}
