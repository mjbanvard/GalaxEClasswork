package com.wolfshead.assignments.assig06;

import java.util.Scanner;

public class Calculator implements MathematicalOperations {
	
/*	
 * 
 * This is a MVP version of the Calculator 
 * 
 */
	
	static Object[] inObject = new Object[3]; 
	static Scanner inEquate = new Scanner(System.in);
	static Object result = 0;
	static double[] compDouble = {0, 0};
	
//	@Override
	public static void add() {
		result = compDouble[0] + compDouble[1];
	}

//	@Override
	public static void subtract() {
		result = compDouble[0] - compDouble[1];	
	}

//	@Override
	public static void multiply() {
		result = compDouble[0] * compDouble[1];	
	}

//	@Override
	public static void divide() {
		result = compDouble[0] / compDouble[1];	
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.print("Please enter a simple equation, two numbers and one operator, separated by spaces or <return>s: ");

//		Option 1: All Strings -
//		for (int i = 0; i < inObject.length; i ++) {
//			inObject[i] = inEquate.next();
//		}

// 		Option 2: Two numbers and one String (because I can't ask for a character yet)
//		Simplified for Doubles
		inObject[0] = inEquate.nextDouble();
		inObject[1] = inEquate.next();
		inObject[2] = inEquate.nextDouble();
		
		inEquate.close();
		
		// Now that array is filled, you can look at elements [0] and [2] for the structure of the number.
		// look for '.' 'f' 'd' 'e' to determine the type of the input.
		// Element [1] is the operator and can be converted to a char and used in a switch
		
		/********* The following is simplified as an example, using double data types ***********/
		compDouble[0] = (double)inObject[0];
		compDouble[1] = (double)inObject[2];
		
		switch ((String)inObject[1]) {
			case "+": 
				add();
				break;
			case "-":
				subtract();
				break;
			case "*":
				multiply();
				break;
			case "/":
				divide();
				break;
			default:
				System.out.println("Cannot determine operator. Please run again.");
		}
		
		System.out.println("This is the result: " + result);
	}

	
}


