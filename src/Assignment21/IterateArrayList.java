package Assignment21;

import java.util.ArrayList;

public class IterateArrayList {
	
	// 2. Write a Java program to iterate through all elements in array list. 


	public static void main(String[] args) {
	
		ArrayList<String> colList = new ArrayList<String>();
		
		colList.add("Gold");
		colList.add("Red");
		colList.add("Green");
		colList.add("Blue");
		colList.add("Black");
		
		System.out.print("The colors in this list are ");
		
		//Iteration
		for (String c : colList) {
			System.out.print(c + ", ");
		}
		
		System.out.println("and that is all.");
	}

}
