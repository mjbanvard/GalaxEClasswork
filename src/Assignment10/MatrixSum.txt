package com.wolfshead.assignments.assig10;

import java.util.Scanner;

public class MatrixSum extends GenerateMatrix{

	public static int addEmUp(int[][] mat, int[] rowCol) {
		int sum = 0;
		
		for (int i = 0; i < rowCol[0]; i++) {
			for (int j = 0; j < rowCol[1]; j++) {
				sum = sum + mat[i][j];
			}
		}
		return sum;
	}
	
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Please enter the number of columns: ");
		int col = sc.nextInt();
		sc.close();
		
		int[] dims = {row, col};
		return dims;
	}
	
	public static int[][] genMatrix(int[] dims) {
		int[][] mat = new int[dims[0]][dims[1]];
		
		for (int i = 0; i < dims[0]; i++) {
			for (int j = 0; j < dims[1]; j++) {
				mat[i][j] = (int) (Math.random() * 100 + 1);
			}
		}
		return mat;
	}
	
	public static void main(String[] args) {
//		MatrixSum ms = new MatrixSum();
		
		int[] matDims = takeInput();
		int[][] newMat = newMatrix(matDims); // newMatrix is method in parent abstract class GenerateMatrix
		
		System.out.println();
		for (int i = 0; i < matDims[0]; i++) {
			for (int j = 0; j < matDims[1]; j++) {
				System.out.print(newMat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The sum of the elements of the multidimensional array above, " + matDims[0] + " rows by " + matDims[1] + " columns, is: " + addEmUp(newMat, matDims));
		
	}

}
