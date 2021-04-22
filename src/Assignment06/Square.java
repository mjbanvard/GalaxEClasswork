package Assignment06;

public class Square extends Shape {

	Square() {}
	
	public void draw() {
		System.out.println("Draw a square.");
	}

	public static void main(String[] args) {
		Shape s = new Square();
		
		s.draw();
	}

}
