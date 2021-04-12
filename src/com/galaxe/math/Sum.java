package com.galaxe.math;

public class Sum {

	public static void main(String[] args) {

		int c = sum(10, 20);
		int d = sum(30, 14);

		System.out.println("The sum of a + b = " + c);
		System.out.println("The sum of a + b = " + d);
	}

	public static int sum(int a, int b) {

		int c = a + b;
		return c;

	}

}
