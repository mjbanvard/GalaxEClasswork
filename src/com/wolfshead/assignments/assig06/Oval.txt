package com.wolfshead.assignments.assig06;

public class Oval extends Shape {

	Oval() {}
	
	public void draw() {
		System.out.println("Draw an oval.");
	}

	public static void main(String[] args) {
		Shape o = new Oval();
		
		o.draw();
	}

}
