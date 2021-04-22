package Assignment21;

import java.util.ArrayList;

public class RetrieveElementArrayList {
	
	// 3. Write a Java program to retrieve an element (at a specified index) from a given array list. 


	public static void main(String[] args) {
	
		ArrayList<String> colList = new ArrayList<String>();
		int pos = 2;
		
		colList.add("Gold");
		colList.add("Red");
		colList.add("Green");
		colList.add("Blue");
		colList.add("Black");
		
		//Retrieve an element from an arraylist
		System.out.println("The Color at position " + (pos + 1) + " is " + colList.get(pos) + ".");
	}

}
