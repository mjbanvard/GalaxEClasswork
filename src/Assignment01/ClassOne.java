package Assignment01;

public class ClassOne {
	
	public static void printMyName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		String myName = args[0];
		printMyName(myName);
	}

}
