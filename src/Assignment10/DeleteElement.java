package Assignment10;

import java.util.Scanner;

public class DeleteElement extends GenerateMatrix {

	public static void fillMDA(int[][] arr) {
		
		int dim = arr[0].length;
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				arr[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
	}
	
	public static void killAnElement(int[][] arr, int num1, int num2) {
		
//		try {
			arr[num1][num2] = 0;
//		} catch (ArrayIndexOutOfBoundsException aIOBE) {
//			System.out.println("The index(es) you entered were out of bounds for the multidimensional array created.");
//		}
		
	}
	
	public static void main(String[] args) {
		
//		DeleteElement de = new DeleteElement();
		
		Scanner sc = new Scanner(System.in);
		int arrDim;
		int rowNum;
		int colNum;
		int value = 06;
		
		System.out.print("For a Symetrical multidimensional array, please enter an array length (integer): ");
		arrDim = sc.nextInt();
		System.out.print("Please enter Row Number (integer): ");
		rowNum = sc.nextInt() - 1;
		System.out.print("Please enter Column Number (integer): ");
		colNum = sc.nextInt() - 1;
		sc.close();
		
		int[] matDims = {arrDim, arrDim};
		int[][] newMat = newMatrix(matDims); // newMatrix is method in parent abstract class GenerateMatrix
		try{
			value = newMat[rowNum][colNum];
			killAnElement(newMat, rowNum, colNum);	
//			MAKE A METHOD FOR PRINTING ARRAY
			for (int i = 0; i < arrDim; i++) {
				for (int j = 0; j < arrDim; j++) {
					System.out.print(newMat[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("The value of the element removed is: " + value + ", from row " + rowNum + " at column "+ colNum);
		} catch (ArrayIndexOutOfBoundsException aIOOBE) {
			System.out.println("The index(es) you entered were out of bounds for the multidimensional array created.");
		}
			
		
		
	}

}
