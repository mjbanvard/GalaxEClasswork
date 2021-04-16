package com.wolfshead.assignments.assig10;

import java.util.Scanner;

public class AddArray {

	public static int[] serveEmUp(int length) {
		int[] newb = new int[length];
		for (int i = 0; i < length; i++) {
			newb[i] = (int) (Math.random() * 10 + 1);
		}
		return newb;
	}
	
	public static int[] addEmUp(int[][] a) {
		for (int i = 0; i < a[1].length; i++) {
			try {
				a[1][i] += a[0][i];
			} catch (ArrayIndexOutOfBoundsException e) {
				a[1][i] = a[1][i];
			}
		}
		return a[1];
	}
	
	public static void printEmOut(int[] b) {
		
		
		System.out.print("{");
		for (int i = 0; i < b.length; i++) {
			if (i < b.length - 1) {
				System.out.print(b[i] + ", ");
			} else 
			System.out.println(b[i] + "}");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arrLen = new int[2];
		int[][] toBeAdded = new int[2][];
				
		for (int i = 0; i < 2; i++) {
			System.out.print("What would you like the length of Array " + (char)('A' + i) + " to be? ");
			arrLen[i] = sc.nextInt();
		}
		sc.close();
		
		for (int j = 0; j < 2; j++) {
			toBeAdded[j]  = serveEmUp(arrLen[j]);
			System.out.print("This is array '" + (char)('A' + j) + "': ");
			printEmOut(toBeAdded[j]);
		}
		
		System.out.print("This is the new content of array 'B': ");
		printEmOut(addEmUp(toBeAdded));
		
	}

}
