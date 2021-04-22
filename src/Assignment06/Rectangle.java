package Assignment06;

public class Rectangle extends Shape {

	Rectangle() {}
	
	public void draw() {
		System.out.println("Draw a rectangle.");
	}

	public static void main(String[] args) {
		Shape r = new Rectangle();
		
		r.draw();
	}

}
