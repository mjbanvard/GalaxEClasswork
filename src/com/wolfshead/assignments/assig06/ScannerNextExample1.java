package com.wolfshead.assignments.assig06;

import java.util.*;  

public class ScannerNextExample1 {
	
    public static void main(String[] args) {      
        System.out.print("Enter full name: ");        
        Scanner scan = new Scanner(System.in);  
        String firstName = scan.next();  
        String lastName = scan.next();  
        System.out.println("First Name is: "+firstName);  
        System.out.println("Last Name is: "+lastName);    
        scan.close();  
    }  
}  