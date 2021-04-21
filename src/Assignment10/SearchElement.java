package Assignment10;

import java.util.Scanner;

public class SearchElement extends GenerateMatrix{

//	public static int[][] genMatrix(int[] dims) {
//		int[][] mat = new int[dims[0]][dims[1]];
//		
//		for (int i = 0; i < dims[0]; i++) {
//			for (int j = 0; j < dims[1]; j++) {
//				mat[i][j] = (i * j + j);
//			}
//		}
//		return mat;
//	}
	
	public static boolean searchForElement(int[][] mat, int val) {
		int len = mat.length;
		int[] first = new int[2];
		boolean isTrue = false;
		outer: for (int i = 0; i < len; i ++) {
			for (int j = 0; j < mat[i].length; j ++) {
				isTrue = (val == mat[i][j]);
				if (isTrue) {
					first[0] = i;
					first[1] = j;
					System.out.println("Element found at row " + (first[0] + 1) + " at column " + (first[1] + 1));
					break outer;}
			}
		}
		return isTrue;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] dims = new int[2];
		int val;
		
		System.out.print("How many rows? ");
		dims[0] = sc.nextInt();
		System.out.print("How many columns? ");
		dims[1] = sc.nextInt();
		
		int[][] newMat = newMatrix(dims);
		
		System.out.print("What value are you looking for? ");
		val = sc.nextInt();
		sc.close();
		
		if (searchForElement(newMat, val)) {
			System.out.println("Found the element in the array.");
		} else {
			System.out.println("That value was not found.");
		}

	}

}
