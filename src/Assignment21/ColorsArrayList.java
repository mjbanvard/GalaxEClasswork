package Assignment21;

import java.util.ArrayList;

public class ColorsArrayList {
	
	// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection. 

	
	public static void main(String[] args) {
		
		ArrayList<String> colList = new ArrayList<String>();
		
		colList.add("Gold");
		colList.add("Red");
		colList.add("Green");
		colList.add("Blue");
		colList.add("Black");
		
		System.out.print("The colors in this list are: ");
		
		//Printing Collection
		System.out.println(colList);		
	
	}

}
