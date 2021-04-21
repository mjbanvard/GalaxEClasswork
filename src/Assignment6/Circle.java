package Assignment6;

public class Circle extends Shape {

	Circle() {}
	
	public void draw() {
		System.out.println("Draw a circle.");
	}
	
	public static void main(String[] args) {
		Shape c = new Circle();
		
		c.draw();
	}

}
