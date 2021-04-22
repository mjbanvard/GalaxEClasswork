package Assignment03;

import java.util.Scanner;

public class Assignment3String {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.print("Enter first name: ");
	    String userFirst = myObj.nextLine(); 
	    System.out.print("Enter last name: ");
	    String userLast = myObj.nextLine(); 
	    myObj.close();
	    System.out.println("Username is: " + userFirst + " " + userLast);  
	
	}

}
