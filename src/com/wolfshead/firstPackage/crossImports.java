package com.wolfshead.firstPackage;

// import java.util.Iterator;

import com.galaxe.math.Sum;

public class crossImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		final int a = s.sum(11, 35);
		System.out.println("The sum is " + a);

		for (char i = '0'; i < '8'; i++) {
			System.out.println(i);
		}
	}

}
