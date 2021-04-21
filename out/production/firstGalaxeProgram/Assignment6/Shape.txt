package com.wolfshead.assignments.assig06;

import java.util.Scanner;

public class Shape {
	
	Shape() {};
	
	public String name = "Shape";
	
	public void draw() {}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What shape would you like to draw?: ");
		String shape = sc.next().toString().toLowerCase();
		sc.close();
		
		Shape s;
		switch (shape) {
			case "circle": s = new Circle();
				break;
			case "rectangle": s = new Rectangle();
				break;
			case "oval": s = new Oval();
				break;
			case "square": s = new Square();
				break;
			default: s = new Shape();
				System.out.println("Please rerun application and enter a valid shape.");
		}
		
//		try {
		s.draw();
//		} catch (Exception e) {
//			System.out.println("An incorrect shape was input.");	
//		}
	}
}
